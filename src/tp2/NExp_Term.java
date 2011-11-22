/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NExp_Term
    extends NExp {

  private final int line;
  private final int pos;
  private final NTerm eTerm;

  @Override
  public void apply(Walker walker) {
    walker.inExp_Term(this);
    walker.caseExp_Term(this);
    walker.outExp_Term(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eTerm.apply(walker);
  }

  public NExp_Term(int line, int pos, NTerm pTerm) {
    this.line = line;
    this.pos = pos;
    this.eTerm = pTerm;
  }

  @Override
  public Type getType() {
    return Type.T_Exp_Term;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Exp;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Exp_Term;
  }

  public NTerm get_Term() {
    return this.eTerm;
  }

  NTerm internalGetTerm() {
    return this.eTerm;
  }
}
