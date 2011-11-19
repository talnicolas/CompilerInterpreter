/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MParamField {

  private final String pName;
  private final MParamField mParamField = this;

  MParamField(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mParamField.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  char* _p");
    sb.append(rName());
    sb.append("_;");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
