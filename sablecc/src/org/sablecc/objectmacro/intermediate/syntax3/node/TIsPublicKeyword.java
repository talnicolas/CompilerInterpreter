/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TIsPublicKeyword extends Token
{
    public TIsPublicKeyword()
    {
        super.setText("is_public");
    }

    public TIsPublicKeyword(int line, int pos)
    {
        super.setText("is_public");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIsPublicKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIsPublicKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIsPublicKeyword text.");
    }
}
