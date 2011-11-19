/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MProductionLrTransitionTarget {

  private final String pNodeType;
  private final String pTarget;
  private final MProductionLrTransitionTarget mProductionLrTransitionTarget = this;

  MProductionLrTransitionTarget(String pNodeType, String pTarget) {
    if(pNodeType == null) throw new NullPointerException();
    this.pNodeType = pNodeType;
    if(pTarget == null) throw new NullPointerException();
    this.pTarget = pTarget;
  }

  String pNodeType() {
    return this.pNodeType;
  }

  String pTarget() {
    return this.pTarget;
  }

  private String rNodeType() {
    return this.mProductionLrTransitionTarget.pNodeType();
  }

  private String rTarget() {
    return this.mProductionLrTransitionTarget.pTarget();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    case T_");
    sb.append(rNodeType());
    sb.append(":");
    sb.append(System.getProperty("line.separator"));
    sb.append("      return L_");
    sb.append(rTarget());
    sb.append(".instance;");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
