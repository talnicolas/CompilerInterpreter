/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

public class MParamClass {

  private final String pName;
  private final MParamClass mParamClass = this;

  public MParamClass(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mParamClass.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("val p");
    sb.append(rName());
    sb.append(": String");
    return sb.toString();
  }

}
