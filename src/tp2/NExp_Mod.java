/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NExp_Mod
    extends NExp {

  private final int line;
  private final int pos;
  private final NExp eLeft;
  private final N$25 eOp;
  private final NExp eRight;

  @Override
  public void apply(Walker walker) {
    walker.inExp_Mod(this);
    walker.caseExp_Mod(this);
    walker.outExp_Mod(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eLeft.apply(walker);
    this.eOp.apply(walker);
    this.eRight.apply(walker);
  }

  NExp_Mod(int line, int pos, NExp pLeft, N$25 pOp, NExp pRight) {
    this.line = line;
    this.pos = pos;
    this.eLeft = pLeft;
    this.eOp = pOp;
    this.eRight = pRight;
  }

  @Override
  public Type getType() {
    return Type.T_Exp_Mod;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Exp;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Exp_Mod;
  }

  public NExp get_Left() {
    return this.eLeft;
  }

  public Token get_Op() {
    return this.eOp;
  }

  public NExp get_Right() {
    return this.eRight;
  }

  NExp internalGetLeft() {
    return this.eLeft;
  }

  N$25 internalGetOp() {
    return this.eOp;
  }

  NExp internalGetRight() {
    return this.eRight;
  }
}