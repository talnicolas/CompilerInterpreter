/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NTerm_Var
    extends NTerm {

  private final int line;
  private final int pos;
  private final NId eId;

  @Override
  public void apply(Walker walker) {
    walker.inTerm_Var(this);
    walker.caseTerm_Var(this);
    walker.outTerm_Var(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eId.apply(walker);
  }

  public NTerm_Var(int line, int pos, NId pId) {
    this.line = line;
    this.pos = pos;
    this.eId = pId;
  }

  @Override
  public Type getType() {
    return Type.T_Term_Var;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Term;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Term_Var;
  }

  public NId get_Id() {
    return this.eId;
  }

  NId internalGetId() {
    return this.eId;
  }
}
