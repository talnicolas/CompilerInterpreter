/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MLexerConflict {

  private final String pToken1;
  private final String pToken2;
  private final MLexerConflict mLexerConflict = this;

  public MLexerConflict(String pToken1, String pToken2) {
    if(pToken1 == null) throw new NullPointerException();
    this.pToken1 = pToken1;
    if(pToken2 == null) throw new NullPointerException();
    this.pToken2 = pToken2;
  }

  String pToken1() {
    return this.pToken1;
  }

  String pToken2() {
    return this.pToken2;
  }

  private String rToken1() {
    return this.mLexerConflict.pToken1();
  }

  private String rToken2() {
    return this.mLexerConflict.pToken2();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MSemanticErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("A conflict has been detected between the \"");
    sb.append(rToken1());
    sb.append("\" and \"");
    sb.append(rToken2());
    sb.append("\" tokens.");
    sb.append(System.getProperty("line.separator"));
    sb.append("An explicit priority must be added between these tokens.");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
