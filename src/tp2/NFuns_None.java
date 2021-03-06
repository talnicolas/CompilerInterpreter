/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NFuns_None
    extends NFuns {

  private final int line;
  private final int pos;

  @Override
  public void apply(Walker walker) {
    walker.inFuns_None(this);
    walker.caseFuns_None(this);
    walker.outFuns_None(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
  }

  public NFuns_None(int line, int pos) {
    this.line = line;
    this.pos = pos;
  }

  @Override
  public Type getType() {
    return Type.T_Funs_None;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Funs;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Funs_None;
  }
}
