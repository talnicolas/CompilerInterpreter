/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.syntax3.node;

import org.sablecc.objectmacro.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TInvalidVar extends Token
{
    public TInvalidVar(String text)
    {
        setText(text);
    }

    public TInvalidVar(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInvalidVar(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInvalidVar(this);
    }
}
