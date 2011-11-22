/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NStmt_If
    extends NStmt {

  private final int line;
  private final int pos;
  private final N$9 eKeyword;
  private final N$0 eLPar;
  private final NExp eExp;
  private final N$1 e$1;
  private final NBlock eBlock;
  private final NOptElse eOptElse;

  @Override
  public void apply(Walker walker) {
    walker.inStmt_If(this);
    walker.caseStmt_If(this);
    walker.outStmt_If(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
    this.eLPar.apply(walker);
    this.eExp.apply(walker);
    this.e$1.apply(walker);
    this.eBlock.apply(walker);
    this.eOptElse.apply(walker);
  }

  NStmt_If(int line, int pos, N$9 pKeyword, N$0 pLPar, NExp pExp, N$1 p$1, NBlock pBlock, NOptElse pOptElse) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
    this.eLPar = pLPar;
    this.eExp = pExp;
    this.e$1 = p$1;
    this.eBlock = pBlock;
    this.eOptElse = pOptElse;
  }

  @Override
  public Type getType() {
    return Type.T_Stmt_If;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Stmt;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Stmt_If;
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

  public NOptElse get_OptElse() {
    return this.eOptElse;
  }

  N$9 internalGetKeyword() {
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

  NOptElse internalGetOptElse() {
    return this.eOptElse;
  }
}
