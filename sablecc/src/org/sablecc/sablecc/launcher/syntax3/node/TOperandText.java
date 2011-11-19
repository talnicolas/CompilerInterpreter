/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.launcher.syntax3.node;

import org.sablecc.sablecc.launcher.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TOperandText extends Token
{
    public TOperandText(String text)
    {
        setText(text);
    }

    public TOperandText(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOperandText(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOperandText(this);
    }
}
