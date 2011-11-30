package interpreter;

import java.util.ArrayList;
import java.util.List;

import exception.InterpreterException;

import semantics.Functions;
import semantics.Type;
import tp2.*;

public class Interpreter extends Walker {

	private Functions functions;
	private ArrayList<Value> currentArgs;
	private ExecutionScope currentScope;
	private Value currentResult;
	private boolean returnSet;

	public Interpreter(Functions functions, String[] arguments) {
		this.functions = functions;
		this.currentScope = new ExecutionScope(null);		
		this.currentScope.declareArgs(arguments);
		this.returnSet = false;
	}

	Value eval(Node node) {
		node.apply(this);
		return currentResult;
	}

	@Override
	public void caseBlock(NBlock node) {
		ExecutionScope parent = currentScope;
		currentScope = new ExecutionScope(parent);
		walkChildren(node.get_Stmts());
		currentScope = parent;
	}

	@Override
	public void caseId(NId node) {
		currentResult = currentScope.getValue(node);
	}

	@Override
	public void caseNum(NNum node) {
		currentResult = new IntValue(Integer.parseInt(node.getText()));
	}

	@Override
	public void caseString(NString node) {
		currentResult = new StringValue(node.getText().replace("\"", ""));
	}

	@Override
	public void caseStmt_Decl(NStmt_Decl node) {
		currentResult = eval(node.get_Exp());
		currentScope.declareVar(node.get_Id(), currentResult);
	}

	@Override
	public void caseStmt_Assign(NStmt_Assign node) {
		currentResult = eval(node.get_Exp());
		currentScope.setValue(node.get_Id(), currentResult);
	}

	@Override
	public void caseStmt_ArrayAssign(NStmt_ArrayAssign node) {
		
		Type typeArray = currentScope.getValue(node.get_Id()).getType();
		int index = ((IntValue)eval(node.get_Index())).getValue();
		
		if (typeArray==Type.BOOL_ARRAY) {
			BoolArrayValue arrayTmp = (BoolArrayValue)currentScope.getValue(node.get_Id());
			boolean valueToSet = ((BoolValue)eval(node.get_Exp())).getValue();
			arrayTmp.set(index, valueToSet, node.get_Op());
		}
		
		else if (typeArray==Type.INT_ARRAY) {
			IntArrayValue arrayTmp = (IntArrayValue)currentScope.getValue(node.get_Id());
			int valueToSet = ((IntValue)eval(node.get_Exp())).getValue();
			arrayTmp.set(index, valueToSet, node.get_Op());
		}
		else if (typeArray==Type.STRING_ARRAY) {
			StringArrayValue arrayTmp = (StringArrayValue)currentScope.getValue(node.get_Id());
			String valueToSet = ((StringValue)eval(node.get_Exp())).getValue();
			arrayTmp.set(index, valueToSet, node.get_Op());
		}
		
	}

	@Override
	public void caseStmt_If(NStmt_If node) {

		currentResult = eval(node.get_Exp());
		if (currentResult == BoolValue.TRUE) {
			walkChildren(node.get_Block());
		}

		else if (currentResult == BoolValue.FALSE && node.get_OptElse() != null) {
			walkChildren(node.get_OptElse());
		}
	}

	@Override
	public void caseStmt_While(NStmt_While node) {
		currentResult = eval(node.get_Exp());
		while (currentResult == BoolValue.TRUE) {
			walkChildren(node.get_Block());
			currentResult = eval(node.get_Exp());
		}
	}

	@Override
	public void caseStmt_Print(NStmt_Print node) {
		currentResult = eval(node.get_Exp());
		System.out.print(currentResult);
	}

	@Override
	public void caseStmt_Println(NStmt_Println node) {
		System.out.println();
	}

	@Override
	public void caseStmt_Return(NStmt_Return node) {
		if(!returnSet) {
			currentResult = eval(node.get_OptExp());
			returnSet = true;
		}
		
	}

	@Override
	public void caseStmt_Call(NStmt_Call node) {

		ExecutionScope parentScope = currentScope;
		currentScope = new ExecutionScope(parentScope);

		List<NParam> params = functions.getParamList(node.get_Id());
		this.currentArgs = new ArrayList<Value>();
		node.get_Args().applyOnChildren(this);

		for (int i = 0; i < params.size(); i++) {
			currentScope.declareVar(params.get(i).get_Id(), currentArgs.get(i));
		}
		returnSet = false;
		walkChildren(functions.getFunction(node.get_Id()).get_Block());
		currentScope = parentScope;
	}

	@Override
	public void caseExp_Eq(NExp_Eq node) {

		if (eval(node.get_Left()).getType() == Type.INT) {

			IntValue leftExp = (IntValue) eval(node.get_Left());
			IntValue rightExp = (IntValue) eval(node.get_Right());

			if (leftExp.getValue() == rightExp.getValue())
				currentResult = BoolValue.TRUE;
			else
				currentResult = BoolValue.FALSE;
		}

		else {
			StringValue rightExp = (StringValue) eval(node.get_Right());
			StringValue leftExp = (StringValue) eval(node.get_Left());
			if (leftExp.getValue().equals(rightExp.getValue()))
				currentResult = BoolValue.TRUE;
			else
				currentResult = BoolValue.FALSE;
		}

	}

	@Override
	public void caseExp_Lt(NExp_Lt node) {

		IntValue leftExp = (IntValue) eval(node.get_Left());
		IntValue rightExp = (IntValue) eval(node.get_Right());

		if (leftExp.getValue() < rightExp.getValue())
			currentResult = BoolValue.TRUE;
		else
			currentResult = BoolValue.FALSE;

	}

	@Override
	public void caseExp_Add(NExp_Add node) {
		if (eval(node.get_Left()).getType() == Type.INT) {

			IntValue leftExp = (IntValue) eval(node.get_Left());
			IntValue rightExp = (IntValue) eval(node.get_Right());

			currentResult = new IntValue(leftExp.getValue()
					+ rightExp.getValue());
		}

		else {
			StringValue rightExp = (StringValue) eval(node.get_Right());
			StringValue leftExp = (StringValue) eval(node.get_Left());

			currentResult = new StringValue(leftExp.getValue()
					+ rightExp.getValue());
		}
	}

	@Override
	public void caseExp_Sub(NExp_Sub node) {
		IntValue leftExp = (IntValue) eval(node.get_Left());
		IntValue rightExp = (IntValue) eval(node.get_Right());

		currentResult = new IntValue(leftExp.getValue() - rightExp.getValue());
	}

	@Override
	public void caseExp_Mul(NExp_Mul node) {
		IntValue leftExp = (IntValue) eval(node.get_Left());
		IntValue rightExp = (IntValue) eval(node.get_Right());

		currentResult = new IntValue(leftExp.getValue() * rightExp.getValue());
	}

	@Override
	public void caseExp_Div(NExp_Div node) {
		IntValue leftExp = (IntValue) eval(node.get_Left());
		IntValue rightExp = (IntValue) eval(node.get_Right());

		if (rightExp.getValue() == 0)
			throw new InterpreterException("Division par 0", node.get_Op());
		currentResult = new IntValue(leftExp.getValue() / rightExp.getValue());
	}

	@Override
	public void caseExp_Mod(NExp_Mod node) {
		IntValue leftExp = (IntValue) eval(node.get_Left());
		IntValue rightExp = (IntValue) eval(node.get_Right());
		currentResult = new IntValue(leftExp.getValue() % rightExp.getValue());
	}

	@Override
	public void caseExp_Neg(NExp_Neg node) {
		IntValue exp = (IntValue) eval(node.get_Term());
		currentResult = new IntValue(-exp.getValue());
	}

	@Override
	public void caseExp_Term(NExp_Term node) {		
			currentResult = eval(node.get_Term());			
	}

	@Override
	public void caseTerm_Num(NTerm_Num node) {
		currentResult = eval(node.get_Num());
	}

	@Override
	public void caseTerm_True(NTerm_True node) {
		currentResult = BoolValue.TRUE;
	}

	@Override
	public void caseTerm_False(NTerm_False node) {
		currentResult = BoolValue.FALSE;
	}

	@Override
	public void caseTerm_String(NTerm_String node) {
		currentResult = eval(node.get_String());
	}

	@Override
	public void caseTerm_Var(NTerm_Var node) {
		currentResult = currentScope.getValue(node.get_Id());
	}

	@Override
	public void caseTerm_Call(NTerm_Call node) {	

		ExecutionScope parentScope = currentScope;
		currentScope = new ExecutionScope(parentScope);

		List<NParam> params = functions.getParamList(node.get_Id());
		this.currentArgs = new ArrayList<Value>();
		node.get_Args().applyOnChildren(this);
		
		for (int i = 0; i < params.size(); i++) {
			currentScope.declareVar(params.get(i).get_Id(), currentArgs.get(i));
		}
		returnSet = false;
		walkChildren(functions.getFunction(node.get_Id()).get_Block());
		currentScope = parentScope;
	}

	@Override
	public void caseTerm_ArrayRef(NTerm_ArrayRef node) {
		Type tArray = currentScope.getValue(node.get_Id()).getType();
		int index = ((IntValue)eval(node.get_Exp())).getValue();
		
		if (tArray == Type.BOOL_ARRAY) {
			BoolArrayValue arrayTmp = (BoolArrayValue)currentScope.getValue(node.get_Id());
			boolean value = arrayTmp.get(index, node.get_LBracket());
			if (value) {
				currentResult = BoolValue.TRUE;
			}
			else {
				currentResult=BoolValue.FALSE;
			}
		}
		else if (tArray == Type.INT_ARRAY) {
			IntArrayValue arrayTmp = (IntArrayValue)currentScope.getValue(node.get_Id());
			int value = arrayTmp.get(index, node.get_LBracket());
			currentResult = new IntValue(value);
		}
		else if (tArray == Type.STRING_ARRAY) {
			StringArrayValue arrayTmp = (StringArrayValue)currentScope.getValue(node.get_Id());
			String value = arrayTmp.get(index, node.get_LBracket());
			currentResult = new StringValue(value);
		}
	}

	@Override
	public void caseTerm_NewIntArray(NTerm_NewIntArray node) {
		IntValue size =(IntValue) eval(node.get_Exp());
		if (size.getValue()>=0) {
			currentResult = new IntArrayValue(size.getValue()); 
			for (int i = 0 ; i < size.getValue() ; i++) {
				((IntArrayValue)currentResult).set(i, 0, node.get_LBracket());
			}
		}
		else {
			throw new InterpreterException("Taille de vecteur non conforme : "+size.getValue(), node.get_LBracket());
		}
	}

	@Override
	public void caseTerm_NewBoolArray(NTerm_NewBoolArray node) {
		IntValue size =(IntValue) eval(node.get_Exp());
		if (size.getValue()>=0) {
			currentResult = new BoolArrayValue(size.getValue()); 
			for (int i = 0 ; i < size.getValue() ; i++) {
				((BoolArrayValue)currentResult).set(i, false, node.get_LBracket());
			}
		}
		else {
			throw new InterpreterException("Taille de vecteur non conforme : "+size.getValue(), node.get_LBracket());
		}
	}

	@Override
	public void caseFun(NFun node) {
	}

	@Override
	public void caseTerm_NewStringArray(NTerm_NewStringArray node) {
		IntValue size =(IntValue) eval(node.get_Exp());
		if (size.getValue()>=0) {
			currentResult = new StringArrayValue(size.getValue()); 
			for (int i = 0 ; i < size.getValue() ; i++) {
				((StringArrayValue)currentResult).set(i, "", node.get_LBracket());
			}
		}
		else {
			throw new InterpreterException("Taille de vecteur non conforme : "+size.getValue(), node.get_LBracket());
		}
	}

	@Override
	public void caseTerm_IntConversion(NTerm_IntConversion node) {
		currentResult = eval(node.get_Exp());
		
		if (currentResult.getType()==Type.STRING) {
			String value= ((StringValue)currentResult).getValue();
			
			try {
				currentResult=new IntValue(Integer.parseInt(value));
			} catch (NumberFormatException ex) {
				throw new InterpreterException("Problème lors de la conversion en int de : "+value+".",node.get_LPar()); 
			}
		}
		
		
	}

	@Override
	public void caseTerm_StringConversion(NTerm_StringConversion node) {
		currentResult = eval(node.get_Exp());
		
		if (currentResult.getType()==Type.INT) {
			int value= ((IntValue)currentResult).getValue();
			currentResult=new StringValue(String.valueOf(value));
		}
		
		else if (currentResult.getType()==Type.BOOL) {
			boolean value = ((BoolValue)currentResult).getValue();
			if (value) {
				currentResult=new StringValue("true");
			}
			else {
				currentResult=new StringValue("false");
			}
		}
	}

	@Override
	public void caseTerm_ArraySize(NTerm_ArraySize node) {
		Type tmpType = eval(node.get_Id()).getType();
		if(tmpType == Type.STRING_ARRAY) {
			StringArrayValue tmpString = (StringArrayValue)eval(node.get_Id());
			this.currentResult = new IntValue(tmpString.size()); 
		} else if(tmpType == Type.INT_ARRAY) {
			IntArrayValue tmpInt = (IntArrayValue)eval(node.get_Id());
			this.currentResult = new IntValue(tmpInt.size()); 
		} else if(tmpType == Type.BOOL_ARRAY) {
			BoolArrayValue tmpBool = (BoolArrayValue)eval(node.get_Id());
			this.currentResult = new IntValue(tmpBool.size()); 
		}
	}

	@Override
	public void caseArg(NArg node) {
		this.currentArgs.add(eval(node.get_Exp()));
	}

}
