/* This file was generated by SableCC ( http://sablecc.org ). */

package tp2;

public class NId
    extends Token {

  public NId(String text, int line, int pos) {
    super(text, line, pos);
  }

  @Override
  public Type getType() {
    return Type.T_Id;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Id;
  }

  @Override
  public void apply(Walker walker) {
    walker.inId(this);
    walker.caseId(this);
    walker.outId(this);
  }
}
