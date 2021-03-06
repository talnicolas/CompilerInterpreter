/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TBeforeOneKeyword extends Token
{
    public TBeforeOneKeyword()
    {
        super.setText("before_one");
    }

    public TBeforeOneKeyword(int line, int pos)
    {
        super.setText("before_one");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBeforeOneKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBeforeOneKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBeforeOneKeyword text.");
    }
}
