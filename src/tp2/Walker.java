/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class Walker {

  public void walk(Node node) {
    if(node != null) {
      node.apply(this);
    }
  }

  public void walkChildren(Node node) {
    if(node != null) {
      node.applyOnChildren(this);
    }
  }

  public void inId(NId node) {
    defaultIn(node);
  }

  public void inNum(NNum node) {
    defaultIn(node);
  }

  public void inString(NString node) {
    defaultIn(node);
  }

  public void inProgram(NProgram node) {
    defaultIn(node);
  }

  public void inBlock(NBlock node) {
    defaultIn(node);
  }

  public void inFun(NFun node) {
    defaultIn(node);
  }

  public void inType_Int(NType_Int node) {
    defaultIn(node);
  }

  public void inType_Bool(NType_Bool node) {
    defaultIn(node);
  }

  public void inType_String(NType_String node) {
    defaultIn(node);
  }

  public void inType_Void(NType_Void node) {
    defaultIn(node);
  }

  public void inType_IntArray(NType_IntArray node) {
    defaultIn(node);
  }

  public void inType_BoolArray(NType_BoolArray node) {
    defaultIn(node);
  }

  public void inType_StringArray(NType_StringArray node) {
    defaultIn(node);
  }

  public void inParam(NParam node) {
    defaultIn(node);
  }

  public void inStmt_Decl(NStmt_Decl node) {
    defaultIn(node);
  }

  public void inStmt_Assign(NStmt_Assign node) {
    defaultIn(node);
  }

  public void inStmt_ArrayAssign(NStmt_ArrayAssign node) {
    defaultIn(node);
  }

  public void inStmt_If(NStmt_If node) {
    defaultIn(node);
  }

  public void inStmt_While(NStmt_While node) {
    defaultIn(node);
  }

  public void inStmt_Print(NStmt_Print node) {
    defaultIn(node);
  }

  public void inStmt_Println(NStmt_Println node) {
    defaultIn(node);
  }

  public void inStmt_Return(NStmt_Return node) {
    defaultIn(node);
  }

  public void inStmt_Call(NStmt_Call node) {
    defaultIn(node);
  }

  public void inExp_Eq(NExp_Eq node) {
    defaultIn(node);
  }

  public void inExp_Lt(NExp_Lt node) {
    defaultIn(node);
  }

  public void inExp_Add(NExp_Add node) {
    defaultIn(node);
  }

  public void inExp_Sub(NExp_Sub node) {
    defaultIn(node);
  }

  public void inExp_Mul(NExp_Mul node) {
    defaultIn(node);
  }

  public void inExp_Div(NExp_Div node) {
    defaultIn(node);
  }

  public void inExp_Mod(NExp_Mod node) {
    defaultIn(node);
  }

  public void inExp_Neg(NExp_Neg node) {
    defaultIn(node);
  }

  public void inExp_Term(NExp_Term node) {
    defaultIn(node);
  }

  public void inTerm_Num(NTerm_Num node) {
    defaultIn(node);
  }

  public void inTerm_True(NTerm_True node) {
    defaultIn(node);
  }

  public void inTerm_False(NTerm_False node) {
    defaultIn(node);
  }

  public void inTerm_String(NTerm_String node) {
    defaultIn(node);
  }

  public void inTerm_Var(NTerm_Var node) {
    defaultIn(node);
  }

  public void inTerm_Par(NTerm_Par node) {
    defaultIn(node);
  }

  public void inTerm_Call(NTerm_Call node) {
    defaultIn(node);
  }

  public void inTerm_ArrayRef(NTerm_ArrayRef node) {
    defaultIn(node);
  }

  public void inTerm_NewIntArray(NTerm_NewIntArray node) {
    defaultIn(node);
  }

  public void inTerm_NewBoolArray(NTerm_NewBoolArray node) {
    defaultIn(node);
  }

  public void inTerm_NewStringArray(NTerm_NewStringArray node) {
    defaultIn(node);
  }

  public void inTerm_IntConversion(NTerm_IntConversion node) {
    defaultIn(node);
  }

  public void inTerm_StringConversion(NTerm_StringConversion node) {
    defaultIn(node);
  }

  public void inTerm_ArraySize(NTerm_ArraySize node) {
    defaultIn(node);
  }

  public void inArg(NArg node) {
    defaultIn(node);
  }

  public void defaultIn(Node node) {
  }

  public void caseId(NId node) {
    defaultCase(node);
  }

  public void caseNum(NNum node) {
    defaultCase(node);
  }

  public void caseString(NString node) {
    defaultCase(node);
  }

  public void caseProgram(NProgram node) {
    defaultCase(node);
  }

  public void caseBlock(NBlock node) {
    defaultCase(node);
  }

  public void caseFun(NFun node) {
    defaultCase(node);
  }

  public void caseType_Int(NType_Int node) {
    defaultCase(node);
  }

  public void caseType_Bool(NType_Bool node) {
    defaultCase(node);
  }

  public void caseType_String(NType_String node) {
    defaultCase(node);
  }

  public void caseType_Void(NType_Void node) {
    defaultCase(node);
  }

  public void caseType_IntArray(NType_IntArray node) {
    defaultCase(node);
  }

  public void caseType_BoolArray(NType_BoolArray node) {
    defaultCase(node);
  }

  public void caseType_StringArray(NType_StringArray node) {
    defaultCase(node);
  }

  public void caseParam(NParam node) {
    defaultCase(node);
  }

  public void caseStmt_Decl(NStmt_Decl node) {
    defaultCase(node);
  }

  public void caseStmt_Assign(NStmt_Assign node) {
    defaultCase(node);
  }

  public void caseStmt_ArrayAssign(NStmt_ArrayAssign node) {
    defaultCase(node);
  }

  public void caseStmt_If(NStmt_If node) {
    defaultCase(node);
  }

  public void caseStmt_While(NStmt_While node) {
    defaultCase(node);
  }

  public void caseStmt_Print(NStmt_Print node) {
    defaultCase(node);
  }

  public void caseStmt_Println(NStmt_Println node) {
    defaultCase(node);
  }

  public void caseStmt_Return(NStmt_Return node) {
    defaultCase(node);
  }

  public void caseStmt_Call(NStmt_Call node) {
    defaultCase(node);
  }

  public void caseExp_Eq(NExp_Eq node) {
    defaultCase(node);
  }

  public void caseExp_Lt(NExp_Lt node) {
    defaultCase(node);
  }

  public void caseExp_Add(NExp_Add node) {
    defaultCase(node);
  }

  public void caseExp_Sub(NExp_Sub node) {
    defaultCase(node);
  }

  public void caseExp_Mul(NExp_Mul node) {
    defaultCase(node);
  }

  public void caseExp_Div(NExp_Div node) {
    defaultCase(node);
  }

  public void caseExp_Mod(NExp_Mod node) {
    defaultCase(node);
  }

  public void caseExp_Neg(NExp_Neg node) {
    defaultCase(node);
  }

  public void caseExp_Term(NExp_Term node) {
    defaultCase(node);
  }

  public void caseTerm_Num(NTerm_Num node) {
    defaultCase(node);
  }

  public void caseTerm_True(NTerm_True node) {
    defaultCase(node);
  }

  public void caseTerm_False(NTerm_False node) {
    defaultCase(node);
  }

  public void caseTerm_String(NTerm_String node) {
    defaultCase(node);
  }

  public void caseTerm_Var(NTerm_Var node) {
    defaultCase(node);
  }

  public void caseTerm_Par(NTerm_Par node) {
    defaultCase(node);
  }

  public void caseTerm_Call(NTerm_Call node) {
    defaultCase(node);
  }

  public void caseTerm_ArrayRef(NTerm_ArrayRef node) {
    defaultCase(node);
  }

  public void caseTerm_NewIntArray(NTerm_NewIntArray node) {
    defaultCase(node);
  }

  public void caseTerm_NewBoolArray(NTerm_NewBoolArray node) {
    defaultCase(node);
  }

  public void caseTerm_NewStringArray(NTerm_NewStringArray node) {
    defaultCase(node);
  }

  public void caseTerm_IntConversion(NTerm_IntConversion node) {
    defaultCase(node);
  }

  public void caseTerm_StringConversion(NTerm_StringConversion node) {
    defaultCase(node);
  }

  public void caseTerm_ArraySize(NTerm_ArraySize node) {
    defaultCase(node);
  }

  public void caseArg(NArg node) {
    defaultCase(node);
  }

  public void defaultCase(Node node) {
    node.applyOnChildren(this);
  }

  public void outId(NId node) {
    defaultOut(node);
  }

  public void outNum(NNum node) {
    defaultOut(node);
  }

  public void outString(NString node) {
    defaultOut(node);
  }

  public void outProgram(NProgram node) {
    defaultOut(node);
  }

  public void outBlock(NBlock node) {
    defaultOut(node);
  }

  public void outFun(NFun node) {
    defaultOut(node);
  }

  public void outType_Int(NType_Int node) {
    defaultOut(node);
  }

  public void outType_Bool(NType_Bool node) {
    defaultOut(node);
  }

  public void outType_String(NType_String node) {
    defaultOut(node);
  }

  public void outType_Void(NType_Void node) {
    defaultOut(node);
  }

  public void outType_IntArray(NType_IntArray node) {
    defaultOut(node);
  }

  public void outType_BoolArray(NType_BoolArray node) {
    defaultOut(node);
  }

  public void outType_StringArray(NType_StringArray node) {
    defaultOut(node);
  }

  public void outParam(NParam node) {
    defaultOut(node);
  }

  public void outStmt_Decl(NStmt_Decl node) {
    defaultOut(node);
  }

  public void outStmt_Assign(NStmt_Assign node) {
    defaultOut(node);
  }

  public void outStmt_ArrayAssign(NStmt_ArrayAssign node) {
    defaultOut(node);
  }

  public void outStmt_If(NStmt_If node) {
    defaultOut(node);
  }

  public void outStmt_While(NStmt_While node) {
    defaultOut(node);
  }

  public void outStmt_Print(NStmt_Print node) {
    defaultOut(node);
  }

  public void outStmt_Println(NStmt_Println node) {
    defaultOut(node);
  }

  public void outStmt_Return(NStmt_Return node) {
    defaultOut(node);
  }

  public void outStmt_Call(NStmt_Call node) {
    defaultOut(node);
  }

  public void outExp_Eq(NExp_Eq node) {
    defaultOut(node);
  }

  public void outExp_Lt(NExp_Lt node) {
    defaultOut(node);
  }

  public void outExp_Add(NExp_Add node) {
    defaultOut(node);
  }

  public void outExp_Sub(NExp_Sub node) {
    defaultOut(node);
  }

  public void outExp_Mul(NExp_Mul node) {
    defaultOut(node);
  }

  public void outExp_Div(NExp_Div node) {
    defaultOut(node);
  }

  public void outExp_Mod(NExp_Mod node) {
    defaultOut(node);
  }

  public void outExp_Neg(NExp_Neg node) {
    defaultOut(node);
  }

  public void outExp_Term(NExp_Term node) {
    defaultOut(node);
  }

  public void outTerm_Num(NTerm_Num node) {
    defaultOut(node);
  }

  public void outTerm_True(NTerm_True node) {
    defaultOut(node);
  }

  public void outTerm_False(NTerm_False node) {
    defaultOut(node);
  }

  public void outTerm_String(NTerm_String node) {
    defaultOut(node);
  }

  public void outTerm_Var(NTerm_Var node) {
    defaultOut(node);
  }

  public void outTerm_Par(NTerm_Par node) {
    defaultOut(node);
  }

  public void outTerm_Call(NTerm_Call node) {
    defaultOut(node);
  }

  public void outTerm_ArrayRef(NTerm_ArrayRef node) {
    defaultOut(node);
  }

  public void outTerm_NewIntArray(NTerm_NewIntArray node) {
    defaultOut(node);
  }

  public void outTerm_NewBoolArray(NTerm_NewBoolArray node) {
    defaultOut(node);
  }

  public void outTerm_NewStringArray(NTerm_NewStringArray node) {
    defaultOut(node);
  }

  public void outTerm_IntConversion(NTerm_IntConversion node) {
    defaultOut(node);
  }

  public void outTerm_StringConversion(NTerm_StringConversion node) {
    defaultOut(node);
  }

  public void outTerm_ArraySize(NTerm_ArraySize node) {
    defaultOut(node);
  }

  public void outArg(NArg node) {
    defaultOut(node);
  }

  public void defaultOut(Node node) {
  }
}
