/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

class MCommandLineErrorTail {

  MCommandLineErrorTail() {
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("The following command provides usage information:");
    sb.append(System.getProperty("line.separator"));
    sb.append(" objectmacro --help");
    sb.append(System.getProperty("line.separator"));
    return sb.toString();
  }

}