/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NTerm_NewBoolArray
    extends NTerm {

  private final int line;
  private final int pos;
  private final N$28 eKeyword;
  private final N$16 e$16;
  private final N$7 eLBracket;
  private final NExp eExp;
  private final N$8 e$8;

  @Override
  public void apply(Walker walker) {
    walker.inTerm_NewBoolArray(this);
    walker.caseTerm_NewBoolArray(this);
    walker.outTerm_NewBoolArray(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
    this.e$16.apply(walker);
    this.eLBracket.apply(walker);
    this.eExp.apply(walker);
    this.e$8.apply(walker);
  }

  NTerm_NewBoolArray(int line, int pos, N$28 pKeyword, N$16 p$16, N$7 pLBracket, NExp pExp, N$8 p$8) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
    this.e$16 = p$16;
    this.eLBracket = pLBracket;
    this.eExp = pExp;
    this.e$8 = p$8;
  }

  @Override
  public Type getType() {
    return Type.T_Term_NewBoolArray;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Term;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Term_NewBoolArray;
  }

  public Token get_Keyword() {
    return this.eKeyword;
  }

  public Token get_LBracket() {
    return this.eLBracket;
  }

  public NExp get_Exp() {
    return this.eExp;
  }

  N$28 internalGetKeyword() {
    return this.eKeyword;
  }

  N$16 internalGet$16() {
    return this.e$16;
  }

  N$7 internalGetLBracket() {
    return this.eLBracket;
  }

  NExp internalGetExp() {
    return this.eExp;
  }

  N$8 internalGet$8() {
    return this.e$8;
  }
}
