/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.syntax3.node;

import org.sablecc.objectmacro.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ATextBlockTextBlockBodyPart extends PTextBlockBodyPart
{
    private PTextBlock _textBlock_;

    public ATextBlockTextBlockBodyPart()
    {
        // Constructor
    }

    public ATextBlockTextBlockBodyPart(
        @SuppressWarnings("hiding") PTextBlock _textBlock_)
    {
        // Constructor
        setTextBlock(_textBlock_);

    }

    @Override
    public Object clone()
    {
        return new ATextBlockTextBlockBodyPart(
            cloneNode(this._textBlock_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATextBlockTextBlockBodyPart(this);
    }

    public PTextBlock getTextBlock()
    {
        return this._textBlock_;
    }

    public void setTextBlock(PTextBlock node)
    {
        if(this._textBlock_ != null)
        {
            this._textBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._textBlock_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._textBlock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._textBlock_ == child)
        {
            this._textBlock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._textBlock_ == oldChild)
        {
            setTextBlock((PTextBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
