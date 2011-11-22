/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NType_StringArray
    extends NType {

  private final int line;
  private final int pos;
  private final N$17 eKeyword;
  private final N$7 eLBracket;
  private final N$8 e$8;

  @Override
  public void apply(Walker walker) {
    walker.inType_StringArray(this);
    walker.caseType_StringArray(this);
    walker.outType_StringArray(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
    this.eLBracket.apply(walker);
    this.e$8.apply(walker);
  }

  NType_StringArray(int line, int pos, N$17 pKeyword, N$7 pLBracket, N$8 p$8) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
    this.eLBracket = pLBracket;
    this.e$8 = p$8;
  }

  @Override
  public Type getType() {
    return Type.T_Type_StringArray;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Type;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Type_StringArray;
  }

  public Token get_Keyword() {
    return this.eKeyword;
  }

  public Token get_LBracket() {
    return this.eLBracket;
  }

  N$17 internalGetKeyword() {
    return this.eKeyword;
  }

  N$7 internalGetLBracket() {
    return this.eLBracket;
  }

  N$8 internalGet$8() {
    return this.e$8;
  }
}
