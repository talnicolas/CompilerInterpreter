/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NBlock
    extends Node {

  private final int line;
  private final int pos;
  private final N$3 eLBrace;
  private final NStmts eStmts;
  private final N$4 e$4;

  @Override
  public void apply(Walker walker) {
    walker.inBlock(this);
    walker.caseBlock(this);
    walker.outBlock(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eLBrace.apply(walker);
    this.eStmts.apply(walker);
    this.e$4.apply(walker);
  }

  NBlock(int line, int pos, N$3 pLBrace, NStmts pStmts, N$4 p$4) {
    this.line = line;
    this.pos = pos;
    this.eLBrace = pLBrace;
    this.eStmts = pStmts;
    this.e$4 = p$4;
  }

  @Override
  public Type getType() {
    return Type.T_Block;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Block;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Block;
  }

  public Token get_LBrace() {
    return this.eLBrace;
  }

  public NStmts get_Stmts() {
    return this.eStmts;
  }

  N$3 internalGetLBrace() {
    return this.eLBrace;
  }

  NStmts internalGetStmts() {
    return this.eStmts;
  }

  N$4 internalGet$4() {
    return this.e$4;
  }
}