/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MExpandConstructorInit {

  private final String pName;
  private final MExpandConstructorInit mExpandConstructorInit = this;
  private final MFile mFile;

  MExpandConstructorInit(String pName, MFile mFile) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(mFile == null) throw new NullPointerException();
    this.mFile = mFile;
  }

  String pName() {
    return this.pName;
  }

  private String rFileName() {
    return this.mFile.pFileName();
  }

  private String rName() {
    return this.mExpandConstructorInit.pName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  m");
    sb.append(rFileName());
    sb.append("->_e");
    sb.append(rName());
    sb.append("_ = List_init();");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
