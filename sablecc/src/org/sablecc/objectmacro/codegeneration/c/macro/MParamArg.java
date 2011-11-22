/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MParamArg {

  private final String pName;
  private final MParamArg mParamArg = this;

  MParamArg(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mParamArg.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("_p");
    sb.append(rName());
    sb.append("_");
    return sb.toString();
  }

}