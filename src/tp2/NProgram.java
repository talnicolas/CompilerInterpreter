/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NProgram
    extends Node {

  private final int line;
  private final int pos;
  private final NFuns eFuns;
  private final NBlock eBlock;

  @Override
  public void apply(Walker walker) {
    walker.inProgram(this);
    walker.caseProgram(this);
    walker.outProgram(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eFuns.apply(walker);
    this.eBlock.apply(walker);
  }

  public NProgram(int line, int pos, NFuns pFuns, NBlock pBlock) {
    this.line = line;
    this.pos = pos;
    this.eFuns = pFuns;
    this.eBlock = pBlock;
  }

  @Override
  public Type getType() {
    return Type.T_Program;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Program;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Program;
  }

  public NFuns get_Funs() {
    return this.eFuns;
  }

  public NBlock get_Block() {
    return this.eBlock;
  }

  NFuns internalGetFuns() {
    return this.eFuns;
  }

  NBlock internalGetBlock() {
    return this.eBlock;
  }
}
