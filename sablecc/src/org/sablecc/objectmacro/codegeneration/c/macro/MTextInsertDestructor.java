/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MTextInsertDestructor {

  private final String pName;
  private final MTextInsertDestructor mTextInsertDestructor = this;

  MTextInsertDestructor(String pName) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
  }

  String pName() {
    return this.pName;
  }

  private String rName() {
    return this.mTextInsertDestructor.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  M");
    sb.append(rName());
    sb.append("_free(t");
    sb.append(rName());
    sb.append(");");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}