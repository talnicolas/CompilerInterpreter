/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

public class MUnknownTarget {

  private final String pTarget;
  private final MUnknownTarget mUnknownTarget = this;

  public MUnknownTarget(String pTarget) {
    if(pTarget == null) throw new NullPointerException();
    this.pTarget = pTarget;
  }

  String pTarget() {
    return this.pTarget;
  }

  private String rTarget() {
    return this.mUnknownTarget.pTarget();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MCommandLineErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("The \"");
    sb.append(rTarget());
    sb.append("\" target is not supported.");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append("The following command lists available target languages:");
    sb.append(System.getProperty("line.separator"));
    sb.append(" objectmacro --list-targets");
    sb.append(System.getProperty("line.separator"));
    sb.append(System.getProperty("line.separator"));
    sb.append(new MCommandLineErrorTail().toString());
    return sb.toString();
  }

}
