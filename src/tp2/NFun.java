/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NFun
    extends Node {

  private final int line;
  private final int pos;
  private final NType eType;
  private final NId eName;
  private final N$0 eLPar;
  private final NParams eParams;
  private final N$1 e$1;
  private final NBlock eBlock;

  @Override
  public void apply(Walker walker) {
    walker.inFun(this);
    walker.caseFun(this);
    walker.outFun(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eType.apply(walker);
    this.eName.apply(walker);
    this.eLPar.apply(walker);
    this.eParams.apply(walker);
    this.e$1.apply(walker);
    this.eBlock.apply(walker);
  }

  NFun(int line, int pos, NType pType, NId pName, N$0 pLPar, NParams pParams, N$1 p$1, NBlock pBlock) {
    this.line = line;
    this.pos = pos;
    this.eType = pType;
    this.eName = pName;
    this.eLPar = pLPar;
    this.eParams = pParams;
    this.e$1 = p$1;
    this.eBlock = pBlock;
  }

  @Override
  public Type getType() {
    return Type.T_Fun;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Fun;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Fun;
  }

  public NType get_Type() {
    return this.eType;
  }

  public NId get_Name() {
    return this.eName;
  }

  public Token get_LPar() {
    return this.eLPar;
  }

  public NParams get_Params() {
    return this.eParams;
  }

  public NBlock get_Block() {
    return this.eBlock;
  }

  NType internalGetType() {
    return this.eType;
  }

  NId internalGetName() {
    return this.eName;
  }

  N$0 internalGetLPar() {
    return this.eLPar;
  }

  NParams internalGetParams() {
    return this.eParams;
  }

  N$1 internalGet$1() {
    return this.e$1;
  }

  NBlock internalGetBlock() {
    return this.eBlock;
  }
}
