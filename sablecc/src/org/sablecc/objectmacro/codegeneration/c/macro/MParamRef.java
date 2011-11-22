/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MParamRef {

  private final String pName;
  private final String pContext;
  private final MParamRef mParamRef = this;
  private final MFile mFile;

  MParamRef(String pName, String pContext, MFile mFile) {
    if(pName == null) throw new NullPointerException();
    this.pName = pName;
    if(pContext == null) throw new NullPointerException();
    this.pContext = pContext;
    if(mFile == null) throw new NullPointerException();
    this.mFile = mFile;
  }

  String pName() {
    return this.pName;
  }

  String pContext() {
    return this.pContext;
  }

  private String rFileName() {
    return this.mFile.pFileName();
  }

  private String rName() {
    return this.mParamRef.pName();
  }

  private String rContext() {
    return this.mParamRef.pContext();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("char* M");
    sb.append(rFileName());
    sb.append("_r");
    sb.append(rName());
    sb.append("(M");
    sb.append(rFileName());
    sb.append("* m");
    sb.append(rFileName());
    sb.append(") {");
    sb.append(System.getProperty("line.separator"));
    sb.append("  return M");
    sb.append(rContext());
    sb.append("_p");
    sb.append(rName());
    sb.append("(m");
    sb.append(rFileName());
    sb.append("->_m");
    sb.append(rContext());
    sb.append("_);");
    sb.append(System.getProperty("line.separator"));
    sb.append("}");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}