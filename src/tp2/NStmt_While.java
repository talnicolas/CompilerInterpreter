/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NStmt_While
    extends NStmt {

  private final int line;
  private final int pos;
  private final N$10 eKeyword;
  private final N$0 eLPar;
  private final NExp eExp;
  private final N$1 e$1;
  private final NBlock eBlock;

  @Override
  public void apply(Walker walker) {
    walker.inStmt_While(this);
    walker.caseStmt_While(this);
    walker.outStmt_While(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
    this.eLPar.apply(walker);
    this.eExp.apply(walker);
    this.e$1.apply(walker);
    this.eBlock.apply(walker);
  }

  NStmt_While(int line, int pos, N$10 pKeyword, N$0 pLPar, NExp pExp, N$1 p$1, NBlock pBlock) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
    this.eLPar = pLPar;
    this.eExp = pExp;
    this.e$1 = p$1;
    this.eBlock = pBlock;
  }

  @Override
  public Type getType() {
    return Type.T_Stmt_While;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Stmt;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Stmt_While;
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

  public NBlock get_Block() {
    return this.eBlock;
  }

  N$10 internalGetKeyword() {
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

  NBlock internalGetBlock() {
    return this.eBlock;
  }
}
