/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MInvalidPriority {

  private final String pLine;
  private final String pChar;
  private final String pToken;
  private final MInvalidPriority mInvalidPriority = this;

  public MInvalidPriority(String pLine, String pChar, String pToken) {
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
    if(pToken == null) throw new NullPointerException();
    this.pToken = pToken;
  }

  String pLine() {
    return this.pLine;
  }

  String pChar() {
    return this.pChar;
  }

  String pToken() {
    return this.pToken;
  }

  private String rLine() {
    return this.mInvalidPriority.pLine();
  }

  private String rChar() {
    return this.mInvalidPriority.pChar();
  }

  private String rToken() {
    return this.mInvalidPriority.pToken();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(new MSemanticErrorHead().toString());
    sb.append(System.getProperty("line.separator"));
    sb.append("Line: ");
    sb.append(rLine());
    sb.append(System.getProperty("line.separator"));
    sb.append("Char: ");
    sb.append(rChar());
    sb.append(System.getProperty("line.separator"));
    sb.append("The priority is invalid, as \"");
    sb.append(rToken());
    sb.append("\" appears on both sides.");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
