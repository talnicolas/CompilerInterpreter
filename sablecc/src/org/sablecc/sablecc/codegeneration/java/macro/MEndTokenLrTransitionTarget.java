/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MEndTokenLrTransitionTarget {

  private final String pTarget;
  private final MEndTokenLrTransitionTarget mEndTokenLrTransitionTarget = this;

  MEndTokenLrTransitionTarget(String pTarget) {
    if(pTarget == null) throw new NullPointerException();
    this.pTarget = pTarget;
  }

  String pTarget() {
    return this.pTarget;
  }

  private String rTarget() {
    return this.mEndTokenLrTransitionTarget.pTarget();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("        case TEnd:");
    sb.append(System.getProperty("line.separator"));
    sb.append("          return L_");
    sb.append(rTarget());
    sb.append(".instance;");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
