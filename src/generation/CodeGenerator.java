package generation;

import java.util.ArrayList;
import java.util.List;

import semantics.Functions;
import tp2.*;

public class CodeGenerator extends Walker {

	private Functions functions;
	private List<NFun> funs;
	private int currentIndent = 0;
	private boolean flagElse = false;
	
	private static final int INDENTSIZE = 4;
	
	public CodeGenerator(Functions functions) {
		this.functions = functions;
		this.funs = new ArrayList<NFun>();
	}

	@Override
	public void caseProgram(NProgram node) {
		System.out.println("public class Main {");
		System.out.println();
		indent();
		System.out.println(getIndent() + "public static void main(String[] args) {");
		System.out.println();
		
		node.get_Block().apply(this);
		System.out.println(getIndent() + "}");
		System.out.println();
		printFuns();
		System.out.println("}");
	}
	
	private void printFuns() {
		for(NFun fun : this.funs) {
			System.out.print(getIndent() + "public static ");
			fun.get_Type().apply(this);
			System.out.print(" ");
			fun.get_Name().apply(this);
			System.out.print("(");
			fun.get_Params().apply(this);
			System.out.println(") {");
			fun.get_Block().apply(this);
			System.out.println(getIndent() + "}");
			System.out.println();
		}
	}
	
	@Override
	public void caseBlock(NBlock node) {
		if(flagElse) {
			System.out.println(getIndent() + "} else {");
		}
		indent();
		node.applyOnChildren(this);
		unindent();
	}
	
	
	@Override
	public void caseString(NString node) {
		System.out.print(node.getText());
	}
	
	@Override
	public void caseId(NId node) {
		System.out.print("_" + node.getText());
	}

	@Override
	public void caseNum(NNum node) {
		System.out.print(node.getText());
	}

	@Override
	public void caseFun(NFun node) {		
	}

	@Override
	public void caseOptExp_One(NOptExp_One node) {
		node.get_Exp().apply(this);
	}
	
	@Override
	public void caseOptExp_None(NOptExp_None node) {
		System.out.print("");
	}
	

	@Override
	public void caseType_Int(NType_Int node) {
		System.out.print("int");
	}

	@Override
	public void caseType_Bool(NType_Bool node) {
		System.out.print("boolean");
	}

	@Override
	public void caseType_String(NType_String node) {
		System.out.print("String");
	}

	@Override
	public void caseType_IntArray(NType_IntArray node) {
		System.out.print("int[]");
	}

	@Override
	public void caseType_BoolArray(NType_BoolArray node) {
		System.out.print("boolean[]");
	}

	@Override
	public void caseType_StringArray(NType_StringArray node) {
		System.out.print("String[]");
	}

	@Override
	public void caseType_Void(NType_Void node) {
		System.out.print("void");
	}
	
	@Override
	public void caseParam(NParam node) {
		node.get_Type().apply(this);
		System.out.print(" ");
		node.get_Id().apply(this);
	}
	
	@Override
	public void caseCommaParams_Many(NCommaParams_Many node) {
		node.get_CommaParams().apply(this);
		System.out.print(", ");
		node.get_Param().apply(this);
	}
	
	@Override
	public void caseFuns_Many(NFuns_Many node) {
		node.get_Funs().apply(this);
		node.get_Fun().apply(this);
	}

	@Override
	public void caseFuns_None(NFuns_None node) {
		System.out.print("");
	}

	@Override
	public void caseParams_Many(NParams_Many node) {
		node.get_Param().apply(this);
		node.get_CommaParams().apply(this);
	}

	@Override
	public void caseParams_None(NParams_None node) {
		System.out.print("");
	}

	@Override
	public void caseCommaParams_None(NCommaParams_None node) {
		System.out.print("");
	}

	@Override
	public void caseStmts_Many(NStmts_Many node) {
		node.get_Stmts().apply(this);
		node.get_Stmt().apply(this);
	}

	@Override
	public void caseStmts_None(NStmts_None node) {
		System.out.print("");
	}

	@Override
	public void caseArgs_Many(NArgs_Many node) {
		node.get_Arg().apply(this);
		node.get_CommaArgs().apply(this);
	}

	@Override
	public void caseArgs_None(NArgs_None node) {
		System.out.print("");
	}

	@Override
	public void caseCommaArgs_Many(NCommaArgs_Many node) {
		node.get_CommaArgs().apply(this);
		System.out.print(", ");
		node.get_Arg().apply(this);
	}

	@Override
	public void caseCommaArgs_None(NCommaArgs_None node) {
		System.out.print("");
	}

	@Override
	public void caseExp_Eq(NExp_Eq node) {
		node.get_Left().apply(this);
		System.out.print(" == ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Lt(NExp_Lt node) {
		node.get_Left().apply(this);
		System.out.print(" < ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Add(NExp_Add node) {
		node.get_Left().apply(this);
		System.out.print(" + ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Sub(NExp_Sub node) {
		node.get_Left().apply(this);
		System.out.print(" - ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Mul(NExp_Mul node) {
		node.get_Left().apply(this);
		System.out.print(" * ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Div(NExp_Div node) {
		node.get_Left().apply(this);
		System.out.print(" / ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Mod(NExp_Mod node) {
		node.get_Left().apply(this);
		System.out.print(" % ");
		node.get_Right().apply(this);
	}

	@Override
	public void caseExp_Neg(NExp_Neg node) {
		System.out.print("-");
		node.get_Term().apply(this);
	}

	@Override
	public void caseExp_Term(NExp_Term node) {
		node.get_Term().apply(this);
	}

	@Override
	public void caseTerm_Num(NTerm_Num node) {
		node.get_Num().apply(this);
	}

	@Override
	public void caseTerm_True(NTerm_True node) {
		System.out.print("true");
	}

	@Override
	public void caseTerm_False(NTerm_False node) {
		System.out.print("false");
	}

	@Override
	public void caseTerm_String(NTerm_String node) {
		node.get_String().apply(this);
	}

	@Override
	public void caseTerm_Var(NTerm_Var node) {
		node.get_Id().apply(this);
	}

	@Override
	public void caseTerm_Par(NTerm_Par node) {
		System.out.print("(");
		node.get_Exp().apply(this);
		System.out.print(")");
	}

	@Override
	public void caseTerm_Call(NTerm_Call node) {
		boolean here = false;
		for(NFun fun : this.funs){
			if(fun.get_Name().getText().equals(node.get_Id().getText())) {
				here = true;
			}
		}
		if(!here) {
			this.funs.add(functions.getFunction(node.get_Id()));
		}
		node.get_Id().apply(this);
		System.out.print("(");
		node.get_Args().apply(this);
		System.out.print(")");
	}

	@Override
	public void caseTerm_ArrayRef(NTerm_ArrayRef node) {
		node.get_Id().apply(this);
		System.out.print("[");
		node.get_Exp().apply(this);
		System.out.print("]");
	}

	@Override
	public void caseTerm_NewIntArray(NTerm_NewIntArray node) {
		System.out.print("new int[");
		node.get_Exp().apply(this);
		System.out.print("]");
	}

	@Override
	public void caseTerm_NewBoolArray(NTerm_NewBoolArray node) {
		System.out.print("new boolean[");
		node.get_Exp().apply(this);
		System.out.print("]");
	}

	@Override
	public void caseTerm_NewStringArray(NTerm_NewStringArray node) {
		System.out.print("new String[");
		node.get_Exp().apply(this);
		System.out.print("]");
	}

	@Override
	public void caseTerm_IntConversion(NTerm_IntConversion node) {
		System.out.print("Integer.parseInt(");
		node.get_Exp().apply(this);
		System.out.print(")");
	}

	@Override
	public void caseTerm_StringConversion(NTerm_StringConversion node) {
		System.out.print("String.valueOf(");
		node.get_Exp().apply(this);
		System.out.print(")");
	}

	@Override
	public void caseTerm_ArraySize(NTerm_ArraySize node) {
		node.get_Id().apply(this);
		System.out.print(".length");
	}

	@Override
	public void caseArg(NArg node) {
		node.get_Exp().apply(this);
	}

	@Override
	public void caseStmt_Print(NStmt_Print node) {
		System.out.print(getIndent() + "System.out.print(");
		node.get_Exp().apply(this);
		System.out.println(");");
		
	}
	
	@Override
	public void caseStmt_Println(NStmt_Println node) {
		System.out.println(getIndent() +  "System.out.println();");
	}
	
	@Override
	public void caseStmt_If(NStmt_If node) {
		System.out.print(getIndent() + "if(");
		node.get_Exp().apply(this);
		System.out.println(") {");		
		node.get_Block().apply(this);		
		flagElse = true;
		node.get_OptElse().apply(this);
		flagElse = false;		
		System.out.println(getIndent() + "}");
	}
	
	@Override
	public void caseStmt_While(NStmt_While node) {
		System.out.print(getIndent() + "while(");
		node.get_Exp().apply(this);
		System.out.println(") {");		
		node.get_Block().apply(this);		
		System.out.println(getIndent() + "}");
	}
	
	@Override
	public void caseStmt_Assign(NStmt_Assign node) {
		System.out.print(getIndent());
		node.get_Id().apply(this);
		System.out.print(" = ");
		node.get_Exp().apply(this);
		System.out.println(";");
	}
	
	@Override
	public void caseStmt_Decl(NStmt_Decl node) {
		System.out.print(getIndent());	
		node.get_Type().apply(this);
		System.out.print(" ");
		node.get_Id().apply(this);
		System.out.print(" = ");
		node.get_Exp().apply(this);
		System.out.println(";");
	}
	
	@Override
	public void caseStmt_ArrayAssign(NStmt_ArrayAssign node) {
		System.out.print(getIndent());	
		node.get_Id().apply(this);
		System.out.print("[");
		node.get_Index().apply(this);
		System.out.print("]");
		System.out.print(" = ");
		node.get_Exp().apply(this);
		System.out.println(";");
	}
	
	@Override
	public void caseStmt_Return(NStmt_Return node) {
		System.out.print(getIndent() + "return ");
		node.get_OptExp().apply(this);
		System.out.println(";");
	}
	
	@Override
	public void caseStmt_Call(NStmt_Call node) {
		boolean here = false;
		for(NFun fun : this.funs){
			if(fun.get_Name().getText().equals(node.get_Id().getText())) {
				here = true;
			}
		}
		if(!here) {
			this.funs.add(functions.getFunction(node.get_Id()));
		}
		System.out.print(getIndent());
		node.get_Id().apply(this);
		System.out.print("(");
		node.get_Args().apply(this);
		System.out.println(");");
	}
	
	@Override
	public void walk(Node node) {
		super.walk(node);
	}
	
	private void indent() {
		this.currentIndent += INDENTSIZE;
	}
	
	private void unindent() {
		this.currentIndent -= INDENTSIZE;
	}
	
	private String getIndent() {
		String res = "";
		for(int i = 0; i < currentIndent; i++) {
			res += " ";
		}
		return res;
	}
}

