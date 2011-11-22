/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MAncestorField {

  private final String pName;
  private final MAncestorField mAncestorField = this;

  MAncestorField(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mAncestorField.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  struct M");
    sb.append(rName());
    sb.append("* _m");
    sb.append(rName());
    sb.append("_;");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}