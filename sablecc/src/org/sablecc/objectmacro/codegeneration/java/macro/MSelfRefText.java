/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MSelfRefText {

  private final MText mText;

  MSelfRefText(MText mText) {
    if(mText == null) throw new NullPointerException();
    this.mText = mText;
  }

  private String rName() {
    return this.mText.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  private final M");
    sb.append(rName());
    sb.append(" m");
    sb.append(rName());
    sb.append(" = this;");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
