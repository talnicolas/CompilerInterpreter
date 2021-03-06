/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MAltProdType {

  private final String pProdName;
  private final MAltProdType mAltProdType = this;

  MAltProdType(String pProdName) {
    if(pProdName == null) throw new NullPointerException();
    this.pProdName = pProdName;
  }

  String pProdName() {
    return this.pProdName;
  }

  private String rProdName() {
    return this.mAltProdType.pProdName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    return ProductionType.T_");
    sb.append(rProdName());
    sb.append(";");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
