/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NOptExp_One
    extends NOptExp {

  private final int line;
  private final int pos;
  private final NExp eExp;

  @Override
  public void apply(Walker walker) {
    walker.inOptExp_One(this);
    walker.caseOptExp_One(this);
    walker.outOptExp_One(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eExp.apply(walker);
  }

  public NOptExp_One(int line, int pos, NExp pExp) {
    this.line = line;
    this.pos = pos;
    this.eExp = pExp;
  }

  @Override
  public Type getType() {
    return Type.T_OptExp_One;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_OptExp;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_OptExp_One;
  }

  public NExp get_Exp() {
    return this.eExp;
  }

  NExp internalGetExp() {
    return this.eExp;
  }
}
