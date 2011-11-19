/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MParamInsert {

  private final String pName;
  private final MParamInsert mParamInsert = this;

  public MParamInsert(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mParamInsert.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("r");
    sb.append(rName());
    sb.append("()");
    return sb.toString();
  }

}
