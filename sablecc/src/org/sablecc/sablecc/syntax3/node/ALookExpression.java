/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ALookExpression extends PExpression
{
    private PExpression _left_;
    private TLookKeyword _lookKeyword_;
    private PExpression _right_;

    public ALookExpression()
    {
        // Constructor
    }

    public ALookExpression(
        @SuppressWarnings("hiding") PExpression _left_,
        @SuppressWarnings("hiding") TLookKeyword _lookKeyword_,
        @SuppressWarnings("hiding") PExpression _right_)
    {
        // Constructor
        setLeft(_left_);

        setLookKeyword(_lookKeyword_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ALookExpression(
            cloneNode(this._left_),
            cloneNode(this._lookKeyword_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALookExpression(this);
    }

    public PExpression getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExpression node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TLookKeyword getLookKeyword()
    {
        return this._lookKeyword_;
    }

    public void setLookKeyword(TLookKeyword node)
    {
        if(this._lookKeyword_ != null)
        {
            this._lookKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lookKeyword_ = node;
    }

    public PExpression getRight()
    {
        return this._right_;
    }

    public void setRight(PExpression node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._lookKeyword_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._lookKeyword_ == child)
        {
            this._lookKeyword_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExpression) newChild);
            return;
        }

        if(this._lookKeyword_ == oldChild)
        {
            setLookKeyword((TLookKeyword) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
