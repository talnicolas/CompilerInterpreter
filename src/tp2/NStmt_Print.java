/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NStmt_Print
    extends NStmt {

  private final int line;
  private final int pos;
  private final N$11 eKeyword;
  private final N$0 eLPar;
  private final NExp eExp;
  private final N$1 e$1;
  private final N$6 e$6;

  @Override
  public void apply(Walker walker) {
    walker.inStmt_Print(this);
    walker.caseStmt_Print(this);
    walker.outStmt_Print(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
    this.eLPar.apply(walker);
    this.eExp.apply(walker);
    this.e$1.apply(walker);
    this.e$6.apply(walker);
  }

  NStmt_Print(int line, int pos, N$11 pKeyword, N$0 pLPar, NExp pExp, N$1 p$1, N$6 p$6) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
    this.eLPar = pLPar;
    this.eExp = pExp;
    this.e$1 = p$1;
    this.e$6 = p$6;
  }

  @Override
  public Type getType() {
    return Type.T_Stmt_Print;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Stmt;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Stmt_Print;
  }

  public Token get_Keyword() {
    return this.eKeyword;
  }

  public Token get_LPar() {
    return this.eLPar;
  }

  public NExp get_Exp() {
    return this.eExp;
  }

  N$11 internalGetKeyword() {
    return this.eKeyword;
  }

  N$0 internalGetLPar() {
    return this.eLPar;
  }

  NExp internalGetExp() {
    return this.eExp;
  }

  N$1 internalGet$1() {
    return this.e$1;
  }

  N$6 internalGet$6() {
    return this.e$6;
  }
}
