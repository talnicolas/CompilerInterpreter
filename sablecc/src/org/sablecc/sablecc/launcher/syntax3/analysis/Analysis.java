/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.launcher.syntax3.analysis;

import org.sablecc.sablecc.launcher.syntax3.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAShortOptionsArgument(AShortOptionsArgument node);
    void caseALongOptionArgument(ALongOptionArgument node);
    void caseAPlainArgument(APlainArgument node);
    void caseAShortOption(AShortOption node);
    void caseALongOption(ALongOption node);
    void caseAOperand(AOperand node);

    void caseTHyphen(THyphen node);
    void caseTDoubleHyphen(TDoubleHyphen node);
    void caseTText(TText node);
    void caseTShortName(TShortName node);
    void caseTLongName(TLongName node);
    void caseTAssign(TAssign node);
    void caseTOperandText(TOperandText node);
    void caseEOF(EOF node);
}
