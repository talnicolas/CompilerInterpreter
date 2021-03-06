/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TRetainedElementKeyword extends Token
{
    public TRetainedElementKeyword()
    {
        super.setText("retained_element");
    }

    public TRetainedElementKeyword(int line, int pos)
    {
        super.setText("retained_element");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRetainedElementKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRetainedElementKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRetainedElementKeyword text.");
    }
}
