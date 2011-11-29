package semantics;

import java.util.ArrayList;
import java.util.List;

import exception.InternalException;
import exception.SemanticException;

import tp2.*;

public class SemanticVerifier extends Walker{

	private SemanticScope currentScope;
	private Type currentType;
	private Functions functions;
	private ArrayList<Type> currentArgs;
	
	public SemanticVerifier(Functions fun) {
		this.functions = fun;
		currentScope=new SemanticScope(null);
		currentScope.declareVar(new NId("args", 0, 0), Type.STRING_ARRAY);
	}

	Type evalType(Node node) {
		node.apply(this);
		return currentType;
	}
	
	@Override
	public void caseStmt_Call(NStmt_Call node) {
		
		List<NParam> params = functions.getParamList(node.get_Id());
		this.currentArgs = new ArrayList<Type>();
		node.get_Args().applyOnChildren(this);
		
		if(this.currentArgs.size() != params.size()) {
			throw new SemanticException("Nombre de parametres incorrects pour la fonction " 
					+ node.get_Id() + ". " + params.size() + " attendus, " + this.currentArgs.size()
					+ " recus.", node.get_LPar());
		}
		
		for(int i = 0; i < currentArgs.size(); i++) {
			Type argType = currentArgs.get(i);
			Type paramType = ntypeToType(params.get(i).get_Type());
			
			if(argType != paramType) {
				throw new SemanticException("Type incorrect pour l'appel de la fonction. ", node.get_LPar());
			}
		
		}
		
	}

	
	@Override
	public void caseTerm_Call(NTerm_Call node) {
		
List<NParam> params = functions.getParamList(node.get_Id());
		
		this.currentArgs = new ArrayList<Type>();
		node.get_Args().applyOnChildren(this);
		
		if(this.currentArgs.size() != params.size()) {
			throw new SemanticException("Nombre de parametres incorrects pour la fonction " 
					+ node.get_Id() + ". " + params.size() + " attendus, " + this.currentArgs.size()
					+ " recus.", node.get_LPar());
		}
		
		for(int i = 0; i < currentArgs.size(); i++) {
			Type argType = currentArgs.get(i);
			Type paramType = ntypeToType(params.get(i).get_Type());
			
			if(argType != paramType) {
				throw new SemanticException("Type incorrect pour l'appel de la fonction. ", node.get_LPar());
			}
			
		}
		
	
		/*
		 * VERIFIER TYPE RETOUR DE LA FONCTION
		 */
	}
	
	@Override
	public void caseNum(NNum node) {
		this.currentType = Type.INT;
	}
	
	@Override
	public void caseTerm_True(NTerm_True node) {
		this.currentType = Type.BOOL;
	}
	
	
	@Override
	public void caseString(NString node) {
		this.currentType=Type.STRING;
	}

	@Override
	public void caseProgram(NProgram node) {
		// TODO Auto-generated method stub
		super.caseProgram(node);
	}

	@Override
	public void caseBlock(NBlock node) {
		SemanticScope parent=currentScope;
		currentScope=new SemanticScope(parent);
		walkChildren(node.get_Stmts());
		currentScope=parent;
	}

	@Override
	public void caseFun(NFun node) {
		SemanticScope parentScope=currentScope;
		currentScope=new SemanticScope(null);
		
		List<NParam> params = functions.getParamList(node.get_Name());
		for (NParam param : params) {
			currentScope.declareVar(param.get_Id(),ntypeToType(param.get_Type()));
		}
		
		walkChildren(node.get_Block());
		currentScope=parentScope;
		
	}

	@Override
	public void caseType_Int(NType_Int node) {
		// TODO Auto-generated method stub
		super.caseType_Int(node);
	}

	@Override
	public void caseType_Bool(NType_Bool node) {
		// TODO Auto-generated method stub
		super.caseType_Bool(node);
	}

	@Override
	public void caseType_String(NType_String node) {
		// TODO Auto-generated method stub
		super.caseType_String(node);
	}

	@Override
	public void caseType_Void(NType_Void node) {
		// TODO Auto-generated method stub
		super.caseType_Void(node);
	}

	@Override
	public void caseType_IntArray(NType_IntArray node) {
		// TODO Auto-generated method stub
		super.caseType_IntArray(node);
	}

	@Override
	public void caseType_BoolArray(NType_BoolArray node) {
		// TODO Auto-generated method stub
		super.caseType_BoolArray(node);
	}

	@Override
	public void caseType_StringArray(NType_StringArray node) {
		// TODO Auto-generated method stub
		super.caseType_StringArray(node);
	}

	@Override
	public void caseParam(NParam node) {
		// TODO Auto-generated method stub
		super.caseParam(node);
	}

	@Override
	public void caseStmt_Decl(NStmt_Decl node) {
		Type declaredType = ntypeToType(node.get_Type());
		Type exprType = evalType(node.get_Exp());		
		
		if (declaredType!=exprType) {
			throw new SemanticException("Types incompatibles : " + declaredType + " et " + exprType,node.get_Op());
		}
		currentScope.declareVar(node.get_Id(), declaredType);
		
	}

	@Override
	public void caseStmt_Assign(NStmt_Assign node) {
		Type idType = currentScope.getType(node.get_Id());
		Type exprType = evalType(node.get_Exp());
		
		if (idType!=exprType) {
			throw new SemanticException("Types incompatibles : " + idType + " et " + exprType,node.get_Op());
		}
	}

	@Override
	public void caseStmt_ArrayAssign(NStmt_ArrayAssign node) {
		// TODO Auto-generated method stub
		super.caseStmt_ArrayAssign(node);
	}

	@Override
	public void caseStmt_If(NStmt_If node) {
		currentType= evalType(node.get_Exp());
		if (currentType==Type.BOOL){
			super.walkChildren(node);
		}
	}

	@Override
	public void caseStmt_While(NStmt_While node) {
		currentType= evalType(node.get_Exp());
		if (currentType==Type.BOOL){
			super.walkChildren(node);
		}
	}

	@Override
	public void caseStmt_Print(NStmt_Print node) {
		currentType = evalType(node.get_Exp());
		if (currentType!=Type.INT && currentType!=Type.STRING) {
			throw new SemanticException("Impossible d'�crire un type : " + currentType.toString(), node.get_LPar());
		}
	}

	@Override
	public void caseStmt_Println(NStmt_Println node) {
		// TODO Auto-generated method stub
		super.caseStmt_Println(node);
	}

	@Override
	public void caseStmt_Return(NStmt_Return node) {
		// TODO Auto-generated method stub
		super.caseStmt_Return(node);
	}

	@Override
	public void caseExp_Eq(NExp_Eq node) {
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.STRING && rightType == Type.STRING) &&
			!(leftType == Type.BOOL && rightType == Type.BOOL) &&
			!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible de comparer ce genre de types: " + leftType +" et " + rightType,node.get_Op());
		}
		currentType=Type.BOOL;
	}

	@Override
	public void caseExp_Lt(NExp_Lt node) {
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible de comparer ce genre de types: " + node.get_Op().toString(),node.get_Op());
		}
		
		currentType=Type.BOOL;
	}

	@Override
	public void caseExp_Add(NExp_Add node) {
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.STRING && rightType == Type.STRING) &&
			!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible d'additionner ce genre de types: " + leftType + rightType,node.get_Op());
		}
		currentType=leftType;
	}

	@Override
	public void caseExp_Sub(NExp_Sub node) {
		
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible de soustraire ce genre de types: " + node.get_Op().toString(),node.get_Op());
		}
		currentType=leftType;
	}

	@Override
	public void caseExp_Mul(NExp_Mul node) {
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible de multiplier ce genre de types: " + node.get_Op().toString(),node.get_Op());
		}
		currentType=leftType;
	}

	@Override
	public void caseExp_Div(NExp_Div node) {
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible de diviser ce genre de types: " + node.get_Op().toString(),node.get_Op());
		}	
		currentType=leftType;
	}

	@Override
	public void caseExp_Mod(NExp_Mod node) {
		Type leftType = evalType(node.get_Left());
		Type rightType = evalType(node.get_Right());
		
		if (!(leftType == Type.INT && rightType == Type.INT)) {
			throw new SemanticException("Impossible de comparer ce genre de types: " + node.get_Op().toString(),node.get_Op());
		}
		
		currentType=Type.BOOL;
	}

	@Override
	public void caseExp_Neg(NExp_Neg node) {
		Type termType = evalType(node.get_Term());	
		if (termType != Type.INT) {
			throw new SemanticException("Impossible d'appliquer le n�gatif de ce type: " + node.get_Op().toString(),node.get_Op());
		}
		currentType=termType;
}

	@Override
	public void caseExp_Term(NExp_Term node) {
		currentType=evalType(node.get_Term());
	}

	@Override
	public void caseTerm_Num(NTerm_Num node) {
		currentType=Type.INT;
	}

	@Override
	public void caseTerm_False(NTerm_False node) {
		currentType=Type.BOOL;	
	}

	@Override
	public void caseTerm_String(NTerm_String node) {
		currentType=Type.STRING;
	}

	@Override
	public void caseTerm_Var(NTerm_Var node) {
		currentType=currentScope.getType(node.get_Id());
	}

	@Override
	public void caseTerm_Par(NTerm_Par node) {
		currentType=evalType(node.get_Exp());
	}

	@Override
	public void caseTerm_ArrayRef(NTerm_ArrayRef node) {
		Type arrayType=currentScope.getType(node.get_Id());
		Type exprType = evalType(node.get_Exp());
		
		if (exprType!=Type.INT ){
			throw new SemanticException("L'index n'est pas de type int : "+exprType,node.get_LBracket());
		}
		
		if (arrayType==Type.BOOL_ARRAY) currentType=Type.BOOL;
		else if (arrayType==Type.INT_ARRAY) currentType=Type.INT;
		else if (arrayType==Type.STRING_ARRAY) currentType=Type.STRING;
		
	}

	@Override
	public void caseTerm_NewIntArray(NTerm_NewIntArray node) {
		Type typeOfExpr = evalType(node.get_Exp());	
		if (typeOfExpr!=Type.INT) {
			throw new SemanticException("Impossible de cr�er un tableau dont la taille est de ce type : "+typeOfExpr,node.get_LBracket());
		}
		currentType = Type.INT_ARRAY;
	}

	@Override
	public void caseTerm_NewBoolArray(NTerm_NewBoolArray node) {
		Type typeOfExpr = evalType(node.get_Exp());	
		if (typeOfExpr!=Type.INT) {
			throw new SemanticException("Impossible de cr�er un tableau dont la taille est de ce type : "+typeOfExpr,node.get_LBracket());
		}
		currentType = Type.BOOL_ARRAY;
	}

	@Override
	public void caseTerm_NewStringArray(NTerm_NewStringArray node) {
		Type typeOfExpr = evalType(node.get_Exp());	
		if (typeOfExpr!=Type.INT) {
			throw new SemanticException("Impossible de cr�er un tableau dont la taill est de ce type : "+typeOfExpr,node.get_LBracket());
		}
		currentType = Type.STRING_ARRAY;
	}

	@Override
	public void caseTerm_IntConversion(NTerm_IntConversion node) {
		currentType= evalType(node.get_Exp());
		if (currentType!=Type.STRING) {
			throw new SemanticException("Impossible de convertir ce type en int : " + currentType,node.get_LPar());
		}

		currentType=Type.INT;
	}

	@Override
	public void caseTerm_StringConversion(NTerm_StringConversion node) {
		currentType= evalType(node.get_Exp());
		if (currentType!=Type.INT && currentType!=Type.BOOL) {
			throw new SemanticException("Impossible de convertir ce type en string : " + currentType,node.get_LPar());
		}
		currentType=Type.STRING;
	}

	@Override
	public void caseTerm_ArraySize(NTerm_ArraySize node) {

		currentType = currentScope.getType(node.get_Id());		
		if(currentType != Type.STRING_ARRAY && currentType != Type.BOOL_ARRAY && currentType != Type.INT_ARRAY) {
			throw new SemanticException("La m�thode size() prend obligatoirement un tableau en argument : " + currentType, node.get_LPar());
		}
		currentType = Type.INT;
	}

	@Override
	public void caseArg(NArg node) {
		this.currentArgs.add(evalType(node.get_Exp()));
	}

	@Override
	public void walk(Node node) {
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
