/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TMacroKeyword extends Token
{
    public TMacroKeyword()
    {
        super.setText("macro");
    }

    public TMacroKeyword(int line, int pos)
    {
        super.setText("macro");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMacroKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMacroKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMacroKeyword text.");
    }
}
