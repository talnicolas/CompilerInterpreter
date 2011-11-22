package semantics;

import interpreter.Value;

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
	}

	Type evalType(NExp node) {
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
	public void caseId(NId node) {
		// TODO Auto-generated method stub
		super.caseId(node);
	}

	@Override
	public void caseString(NString node) {
		// TODO Auto-generated method stub
		super.caseString(node);
	}

	@Override
	public void caseProgram(NProgram node) {
		// TODO Auto-generated method stub
		super.caseProgram(node);
	}

	@Override
	public void caseBlock(NBlock node) {
		// TODO Auto-generated method stub
		super.caseBlock(node);
	}

	@Override
	public void caseFun(NFun node) {
		// TODO Auto-generated method stub
		super.caseFun(node);
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
		// TODO Auto-generated method stub
		super.caseStmt_Decl(node);
	}

	@Override
	public void caseStmt_Assign(NStmt_Assign node) {
		// TODO Auto-generated method stub
		super.caseStmt_Assign(node);
	}

	@Override
	public void caseStmt_ArrayAssign(NStmt_ArrayAssign node) {
		// TODO Auto-generated method stub
		super.caseStmt_ArrayAssign(node);
	}

	@Override
	public void caseStmt_If(NStmt_If node) {
		// TODO Auto-generated method stub
		super.caseStmt_If(node);
	}

	@Override
	public void caseStmt_While(NStmt_While node) {
		// TODO Auto-generated method stub
		super.caseStmt_While(node);
	}

	@Override
	public void caseStmt_Print(NStmt_Print node) {
		// TODO Auto-generated method stub
		super.caseStmt_Print(node);
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
		// TODO Auto-generated method stub
		super.caseExp_Eq(node);
	}

	@Override
	public void caseExp_Lt(NExp_Lt node) {
		// TODO Auto-generated method stub
		super.caseExp_Lt(node);
	}

	@Override
	public void caseExp_Add(NExp_Add node) {
		// TODO Auto-generated method stub
		super.caseExp_Add(node);
	}

	@Override
	public void caseExp_Sub(NExp_Sub node) {
		// TODO Auto-generated method stub
		super.caseExp_Sub(node);
	}

	@Override
	public void caseExp_Mul(NExp_Mul node) {
		// TODO Auto-generated method stub
		super.caseExp_Mul(node);
	}

	@Override
	public void caseExp_Div(NExp_Div node) {
		// TODO Auto-generated method stub
		super.caseExp_Div(node);
	}

	@Override
	public void caseExp_Mod(NExp_Mod node) {
		// TODO Auto-generated method stub
		super.caseExp_Mod(node);
	}

	@Override
	public void caseExp_Neg(NExp_Neg node) {
		// TODO Auto-generated method stub
		super.caseExp_Neg(node);
	}

	@Override
	public void caseExp_Term(NExp_Term node) {
		// TODO Auto-generated method stub
		super.caseExp_Term(node);
	}

	@Override
	public void caseTerm_Num(NTerm_Num node) {
		// TODO Auto-generated method stub
		super.caseTerm_Num(node);
	}

	@Override
	public void caseTerm_False(NTerm_False node) {
		// TODO Auto-generated method stub
		super.caseTerm_False(node);
	}

	@Override
	public void caseTerm_String(NTerm_String node) {
		// TODO Auto-generated method stub
		super.caseTerm_String(node);
	}

	@Override
	public void caseTerm_Var(NTerm_Var node) {
		// TODO Auto-generated method stub
		super.caseTerm_Var(node);
	}

	@Override
	public void caseTerm_Par(NTerm_Par node) {
		// TODO Auto-generated method stub
		super.caseTerm_Par(node);
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
	public void caseTerm_NewStringArray(NTerm_NewStringArray node) {
		// TODO Auto-generated method stub
		super.caseTerm_NewStringArray(node);
	}

	@Override
	public void caseTerm_IntConversion(NTerm_IntConversion node) {
		// TODO Auto-generated method stub
		super.caseTerm_IntConversion(node);
	}

	@Override
	public void caseTerm_StringConversion(NTerm_StringConversion node) {
		// TODO Auto-generated method stub
		super.caseTerm_StringConversion(node);
	}

	@Override
	public void caseTerm_ArraySize(NTerm_ArraySize node) {
		// TODO Auto-generated method stub
		super.caseTerm_ArraySize(node);
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
