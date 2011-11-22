/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NType_String
    extends NType {

  private final int line;
  private final int pos;
  private final N$17 eKeyword;

  @Override
  public void apply(Walker walker) {
    walker.inType_String(this);
    walker.caseType_String(this);
    walker.outType_String(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
  }

  NType_String(int line, int pos, N$17 pKeyword) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
  }

  @Override
  public Type getType() {
    return Type.T_Type_String;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Type;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Type_String;
  }

  public Token get_Keyword() {
    return this.eKeyword;
  }

  N$17 internalGetKeyword() {
    return this.eKeyword;
  }
}
