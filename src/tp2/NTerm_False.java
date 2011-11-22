/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NTerm_False
    extends NTerm {

  private final int line;
  private final int pos;
  private final N$27 eKeyword;

  @Override
  public void apply(Walker walker) {
    walker.inTerm_False(this);
    walker.caseTerm_False(this);
    walker.outTerm_False(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eKeyword.apply(walker);
  }

  NTerm_False(int line, int pos, N$27 pKeyword) {
    this.line = line;
    this.pos = pos;
    this.eKeyword = pKeyword;
  }

  @Override
  public Type getType() {
    return Type.T_Term_False;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Term;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Term_False;
  }

  public Token get_Keyword() {
    return this.eKeyword;
  }

  N$27 internalGetKeyword() {
    return this.eKeyword;
  }
}
