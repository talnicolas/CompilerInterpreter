/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MEndCondition {

  private final String pAhead;
  private final MEndCondition mEndCondition = this;

  MEndCondition(String pAhead) {
    if(pAhead == null) throw new NullPointerException();
    this.pAhead = pAhead;
  }

  String pAhead() {
    return this.pAhead;
  }

  private String rAhead() {
    return this.mEndCondition.pAhead();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("parser.look(");
    sb.append(rAhead());
    sb.append(").getInternalType() == Node.InternalType.TEnd");
    return sb.toString();
  }

}
