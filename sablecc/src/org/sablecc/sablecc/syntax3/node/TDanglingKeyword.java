/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TDanglingKeyword extends Token
{
    public TDanglingKeyword()
    {
        super.setText("Dangling");
    }

    public TDanglingKeyword(int line, int pos)
    {
        super.setText("Dangling");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDanglingKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDanglingKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDanglingKeyword text.");
    }
}
