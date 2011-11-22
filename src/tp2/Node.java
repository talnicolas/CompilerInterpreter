/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public abstract class Node {

  public abstract Type getType();

  public static enum Type {
    T_Id,
    T_Num,
    T_String,
    T_Program,
    T_Block,
    T_Fun,
    T_Type_Int,
    T_Type_Bool,
    T_Type_String,
    T_Type_Void,
    T_Type_IntArray,
    T_Type_BoolArray,
    T_Type_StringArray,
    T_Param,
    T_Stmt_Decl,
    T_Stmt_Assign,
    T_Stmt_ArrayAssign,
    T_Stmt_If,
    T_Stmt_While,
    T_Stmt_Print,
    T_Stmt_Println,
    T_Stmt_Return,
    T_Stmt_Call,
    T_Exp_Eq,
    T_Exp_Lt,
    T_Exp_Add,
    T_Exp_Sub,
    T_Exp_Mul,
    T_Exp_Div,
    T_Exp_Mod,
    T_Exp_Neg,
    T_Exp_Term,
    T_Term_Num,
    T_Term_True,
    T_Term_False,
    T_Term_String,
    T_Term_Var,
    T_Term_Par,
    T_Term_Call,
    T_Term_ArrayRef,
    T_Term_NewIntArray,
    T_Term_NewBoolArray,
    T_Term_NewStringArray,
    T_Term_IntConversion,
    T_Term_StringConversion,
    T_Term_ArraySize,
    T_Arg,
    TEnd,
    TAnonymous;
  }

  public abstract ProductionType getProductionType();

  public static enum ProductionType {
    T_$Start,
    T_Program,
    T_Funs,
    T_Block,
    T_Fun,
    T_Type,
    T_Params,
    T_Param,
    T_CommaParams,
    T_Stmts,
    T_Stmt,
    T_Exp,
    T_OptElse,
    T_OptExp,
    T_Args,
    T_Term,
    T_Arg,
    T_CommaArgs,
    TNotAProduction;
  }

  public abstract void apply(Walker walker);
  public abstract void applyOnChildren(Walker walker);

  private Node parent;

  public Node getParent() {
    return this.parent;
  }

  void setParent(Node parent) {
    this.parent = parent;
  }

  abstract InternalType getInternalType();

  static enum InternalType {
    T_Id,
    T_$0,
    T_$1,
    T_$2,
    T_$3,
    T_$4,
    T_$5,
    T_$6,
    T_$7,
    T_$8,
    T_$9,
    T_$10,
    T_$11,
    T_$12,
    T_$13,
    T_$14,
    T_$15,
    T_$16,
    T_$17,
    T_$18,
    T_$19,
    T_$20,
    T_$21,
    T_$22,
    T_$23,
    T_$24,
    T_$25,
    T_Num,
    T_$26,
    T_$27,
    T_String,
    T_$28,
    T_$29,
    T_$Start,
    T_Program,
    T_Funs_$1,
    T_Funs_$2,
    T_Block,
    T_Fun,
    T_Type_Int,
    T_Type_Bool,
    T_Type_String,
    T_Type_Void,
    T_Type_IntArray,
    T_Type_BoolArray,
    T_Type_StringArray,
    T_Params_$1,
    T_Params_$2,
    T_Param,
    T_CommaParams_$1,
    T_CommaParams_$2,
    T_Stmts_$1,
    T_Stmts_$2,
    T_Stmt_Decl,
    T_Stmt_Assign,
    T_Stmt_ArrayAssign,
    T_Stmt_If,
    T_Stmt_While,
    T_Stmt_Print,
    T_Stmt_Println,
    T_Stmt_Return,
    T_Stmt_Call,
    T_Exp_Eq,
    T_Exp_Lt,
    T_Exp_Add,
    T_Exp_Sub,
    T_Exp_Mul,
    T_Exp_Div,
    T_Exp_Mod,
    T_Exp_Neg,
    T_Exp_Term,
    T_OptElse_$1,
    T_OptElse_$2,
    T_OptExp_$1,
    T_OptExp_$2,
    T_Args_$1,
    T_Args_$2,
    T_Term_Num,
    T_Term_True,
    T_Term_False,
    T_Term_String,
    T_Term_Var,
    T_Term_Par,
    T_Term_Call,
    T_Term_ArrayRef,
    T_Term_NewIntArray,
    T_Term_NewBoolArray,
    T_Term_NewStringArray,
    T_Term_IntConversion,
    T_Term_StringConversion,
    T_Term_ArraySize,
    T_Arg,
    T_CommaArgs_$1,
    T_CommaArgs_$2,
    TEnd;
  }
}
