/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.syntax3.node;

import org.sablecc.objectmacro.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AEscapeMacroBodyPart extends PMacroBodyPart
{
    private TEscape _escape_;

    public AEscapeMacroBodyPart()
    {
        // Constructor
    }

    public AEscapeMacroBodyPart(
        @SuppressWarnings("hiding") TEscape _escape_)
    {
        // Constructor
        setEscape(_escape_);

    }

    @Override
    public Object clone()
    {
        return new AEscapeMacroBodyPart(
            cloneNode(this._escape_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscapeMacroBodyPart(this);
    }

    public TEscape getEscape()
    {
        return this._escape_;
    }

    public void setEscape(TEscape node)
    {
        if(this._escape_ != null)
        {
            this._escape_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escape_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._escape_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escape_ == child)
        {
            this._escape_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._escape_ == oldChild)
        {
            setEscape((TEscape) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
