/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TTextKeyword extends Token
{
    public TTextKeyword()
    {
        super.setText("text");
    }

    public TTextKeyword(int line, int pos)
    {
        super.setText("text");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTextKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTextKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTextKeyword text.");
    }
}
