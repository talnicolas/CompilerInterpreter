/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

public class MIncorrectArgumentCount {

  private final String pLine;
  private final String pChar;
  private final String pCurrentCount;
  private final String pName;
  private final String pRefLine;
  private final String pRefChar;
  private final String pExpectedCount;
  private final MIncorrectArgumentCount mIncorrectArgumentCount = this;

  public MIncorrectArgumentCount(String pLine, String pChar, String pCurrentCount, String pName, String pRefLine, String pRefChar, String pExpectedCount) {
    if(pLine == null) throw new NullPointerException();
    this.pLine = pLine;
    if(pChar == null) throw new NullPointerException();
    this.pChar = pChar;
    if(pCurrentCount == null) throw new NullPointerException();
    this.pCurrentCount = pCurrentCount;
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(pRefLine == null) throw new NullPointerException();
    this.pRefLine = pRefLine;
    if(pRefChar == null) throw new NullPointerException();
    this.pRefChar = pRefChar;
    if(pExpectedCount == null) throw new NullPointerException();
    this.pExpectedCount = pExpectedCount;
  }

  String pLine() {
    return this.pLine;
  }

  String pChar() {
    return this.pChar;
  }

  String pCurrentCount() {
    return this.pCurrentCount;
  }

  String pName() {
    return this.pName;
  }

  String pRefLine() {
    return this.pRefLine;
  }

  String pRefChar() {
    return this.pRefChar;
  }

  String pExpectedCount() {
    return this.pExpectedCount;
  }

  private String rLine() {
    return this.mIncorrectArgumentCount.pLine();
  }

  private String rChar() {
    return this.mIncorrectArgumentCount.pChar();
  }

  private String rCurrentCount() {
    return this.mIncorrectArgumentCount.pCurrentCount();
  }

  private String rExpectedCount() {
    return this.mIncorrectArgumentCount.pExpectedCount();
  }

  private String rName() {
    return this.mIncorrectArgumentCount.pName();
  }

  private String rRefLine() {
    return this.mIncorrectArgumentCount.pRefLine();
  }

  private String rRefChar() {
    return this.mIncorrectArgumentCount.pRefChar();
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
    sb.append("The insert has ");
    sb.append(rCurrentCount());
    sb.append(" arguments, instead of ");
    sb.append(rExpectedCount());
    sb.append(" arguments.");
    sb.append(System.getProperty("line.separator"));
    sb.append("The \"");
    sb.append(rName());
    sb.append("\" text block is defined on line ");
    sb.append(rRefLine());
    sb.append(", char ");
    sb.append(rRefChar());
    sb.append(".");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}