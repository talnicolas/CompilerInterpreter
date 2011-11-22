package generation;

import semantics.Functions;
import tp2.*;

public class CodeGenerator extends Walker {

	private Functions functions;
	
	private int currentIndent = 0;
	private boolean flagElse = false;
	
	private static final int INDENTSIZE = 4;
	
	public CodeGenerator(Functions functions) {
		this.functions = functions;
	}

	@Override
	public void caseProgram(NProgram node) {
		System.out.println("public class Main {");
		System.out.println();
		indent();
		System.out.println(getIndent() + "public static void main(String[] args) {");
		
		indent();
		node.get_Block().apply(this);
		System.out.println("}");
		System.out.println("}");
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
		System.out.println(node.getText());
	}
	
	@Override
	public void caseStmt_Print(NStmt_Print node) {
		System.out.print(getIndent() + "System.out.print(");
		node.get_Exp().apply(this);
		System.out.println(");");
		
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

