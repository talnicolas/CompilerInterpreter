package interpreter;

import java.util.ArrayList;
import java.util.List;

import exception.InternalException;
import exception.InterpreterException;
import exception.SemanticException;

import semantics.Functions;
import semantics.SemanticScope;
import semantics.Type;
import tp2.*;

public class Interpreter extends Walker {

	private Functions functions;
	private ArrayList<Value> currentArgs;
	private ExecutionScope currentScope;
	private Value currentResult;

	public Interpreter(Functions functions, String[] arguments) {
		this.functions = functions;
		this.currentScope = new ExecutionScope(null);		
		this.currentScope.declareArgs(arguments);
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
		// TODO Auto-generated method stub
		super.caseStmt_ArrayAssign(node);
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
		System.out.println(currentResult);
	}

	@Override
	public void caseStmt_Println(NStmt_Println node) {
		System.out.println();
	}

	@Override
	public void caseStmt_Return(NStmt_Return node) {
		super.walk(node);
	}

	@Override
	public void caseStmt_Call(NStmt_Call node) {
		ExecutionScope parentScope = currentScope;
		ExecutionScope newScope = new ExecutionScope(null);

		List<NParam> params = functions.getParamList(node.get_Id());
		this.currentArgs = new ArrayList<Value>();
		node.get_Args().applyOnChildren(this);

		for (int i = 0; i < params.size(); i++) {
			newScope.declareVar(params.get(i).get_Id(), currentArgs.get(i));
		}
		currentScope = newScope;
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
			if (leftExp == rightExp)
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
		currentResult = BoolValue.TRUE;
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
		currentScope = new ExecutionScope(null);

		List<NParam> params = functions.getParamList(node.get_Id());
		this.currentArgs = new ArrayList<Value>();
		node.get_Args().applyOnChildren(this);

		for (int i = 0; i < params.size(); i++) {
			currentScope.declareVar(params.get(i).get_Id(), currentArgs.get(i));
		}
		walkChildren(functions.getFunction(node.get_Id()).get_Block());
		currentScope = parentScope;
	}

	@Override
	public void caseTerm_ArrayRef(NTerm_ArrayRef node) {
		// TODO Auto-generated method stub
		super.caseTerm_ArrayRef(node);
	}

	@Override
	public void caseTerm_NewIntArray(NTerm_NewIntArray node) {
		// TODO Auto-generated method stub
		super.caseTerm_NewIntArray(node);
	}

	@Override
	public void caseTerm_NewBoolArray(NTerm_NewBoolArray node) {
		// TODO Auto-generated method stub
		super.caseTerm_NewBoolArray(node);
	}

	@Override
	public void caseFun(NFun node) {

	}

	@Override
	public void caseTerm_NewStringArray(NTerm_NewStringArray node) {
		// TODO Auto-generated method stub
		super.caseTerm_NewStringArray(node);
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
				currentResult=new StringValue("Vrai");
			}
			else {
				currentResult=new StringValue("Faux");
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

	@Override
	public void caseCommaArgs_Many(NCommaArgs_Many node) {
		// TODO Auto-generated method stub
		super.caseCommaArgs_Many(node);
	}

	@Override
	public void caseCommaArgs_None(NCommaArgs_None node) {
		// TODO Auto-generated method stub
		super.caseCommaArgs_None(node);
	}

	@Override
	public void walk(Node node) {
		// TODO Auto-generated method stub
		super.walk(node);
	}
	
	/**
	 * Convert NType parameters to Type
	 * @param ntype
	 * @return the corresponding Type
	 */
	private Type ntypeToType(NType ntype) {
		Type res;
		switch(ntype.getType()){
		case T_Type_Int :
			res = Type.INT;
			break;
		case T_Type_Bool : 
			res = Type.BOOL;
			break;
		case T_Type_String :
			res = Type.STRING;
			break;
		case T_Type_Void :
			res = Type.VOID;
			break;
		case T_Type_IntArray :
			res = Type.INT_ARRAY;
			break;
		case T_Type_StringArray :
			res = Type.STRING_ARRAY;
			break;
		case T_Type_BoolArray :
			res = Type.BOOL_ARRAY;
		default :
			throw new InternalException("BUG : argument sans type");
		}
		return res;
		
	}

}
