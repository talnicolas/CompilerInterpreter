/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.launcher.syntax3.parser;

import org.sablecc.sablecc.launcher.syntax3.node.*;
import org.sablecc.sablecc.launcher.syntax3.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTHyphen(@SuppressWarnings("unused") THyphen node)
    {
        this.index = 0;
    }

    @Override
    public void caseTDoubleHyphen(@SuppressWarnings("unused") TDoubleHyphen node)
    {
        this.index = 1;
    }

    @Override
    public void caseTText(@SuppressWarnings("unused") TText node)
    {
        this.index = 2;
    }

    @Override
    public void caseTShortName(@SuppressWarnings("unused") TShortName node)
    {
        this.index = 3;
    }

    @Override
    public void caseTLongName(@SuppressWarnings("unused") TLongName node)
    {
        this.index = 4;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 5;
    }

    @Override
    public void caseTOperandText(@SuppressWarnings("unused") TOperandText node)
    {
        this.index = 6;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 7;
    }
}
