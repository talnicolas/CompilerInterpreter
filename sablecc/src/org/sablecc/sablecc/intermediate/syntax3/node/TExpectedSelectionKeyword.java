/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TExpectedSelectionKeyword extends Token
{
    public TExpectedSelectionKeyword()
    {
        super.setText("expected_selection");
    }

    public TExpectedSelectionKeyword(int line, int pos)
    {
        super.setText("expected_selection");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExpectedSelectionKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExpectedSelectionKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExpectedSelectionKeyword text.");
    }
}
