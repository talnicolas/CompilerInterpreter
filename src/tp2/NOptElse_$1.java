/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class NOptElse_$1
    extends NOptElse {

  private final int line;
  private final int pos;
  private final N$14 eKeyword;
  private final NBlock eBlock;

  @Override
  public void apply(Walker walker) {
    walker.defaultIn(this);
    walker.defaultCase(this);
    walker.defaultOut(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
    this.eBlock.apply(walker);
  }

  NOptElse_$1(int line, int pos, N$14 pKeyword, NBlock pBlock) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
    this.eBlock = pBlock;
  }

  @Override
  public Type getType() {
    return Type.TAnonymous;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_OptElse;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_OptElse_$1;
  }

  N$14 internalGetKeyword() {
    return this.eKeyword;
  }

  NBlock internalGetBlock() {
    return this.eBlock;
  }
}
