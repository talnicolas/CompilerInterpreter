/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

import java.util.*;

public class MTextInsertPart {

  private final List<Object> eTextInsert = new LinkedList<Object>();

  public MTextInsertPart() {
  }

  public MTextInsert newTextInsert(String pName) {
    MTextInsert lTextInsert = new MTextInsert(pName);
    this.eTextInsert.add(lTextInsert);
    return lTextInsert;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    sb.append(");
    for(Object oTextInsert : this.eTextInsert) {
      sb.append(oTextInsert.toString());
    }
    sb.append(")");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}
