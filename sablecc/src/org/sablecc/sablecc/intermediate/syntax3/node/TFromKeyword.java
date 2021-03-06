/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TFromKeyword extends Token
{
    public TFromKeyword()
    {
        super.setText("from");
    }

    public TFromKeyword(int line, int pos)
    {
        super.setText("from");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFromKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFromKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFromKeyword text.");
    }
}
