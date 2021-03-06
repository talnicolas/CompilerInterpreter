/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NArg
    extends Node {

  private final int line;
  private final int pos;
  private final NExp eExp;

  @Override
  public void apply(Walker walker) {
    walker.inArg(this);
    walker.caseArg(this);
    walker.outArg(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eExp.apply(walker);
  }

  public NArg(int line, int pos, NExp pExp) {
    this.line = line;
    this.pos = pos;
    this.eExp = pExp;
  }

  @Override
  public Type getType() {
    return Type.T_Arg;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Arg;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Arg;
  }

  public NExp get_Exp() {
    return this.eExp;
  }

  NExp internalGetExp() {
    return this.eExp;
  }
}
