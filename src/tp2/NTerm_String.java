/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NTerm_String
    extends NTerm {

  private final int line;
  private final int pos;
  private final NString eString;

  @Override
  public void apply(Walker walker) {
    walker.inTerm_String(this);
    walker.caseTerm_String(this);
    walker.outTerm_String(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eString.apply(walker);
  }

  public NTerm_String(int line, int pos, NString pString) {
    this.line = line;
    this.pos = pos;
    this.eString = pString;
  }

  @Override
  public Type getType() {
    return Type.T_Term_String;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Term;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Term_String;
  }

  public NString get_String() {
    return this.eString;
  }

  NString internalGetString() {
    return this.eString;
  }
}
