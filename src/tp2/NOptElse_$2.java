/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

class NOptElse_$2
    extends NOptElse {

  private final int line;
  private final int pos;

  @Override
  public void apply(Walker walker) {
    walker.defaultIn(this);
    walker.defaultCase(this);
    walker.defaultOut(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
  }

  public NOptElse_$2(int line, int pos) {
    this.line = line;
    this.pos = pos;
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
    return InternalType.T_OptElse_$2;
  }
}