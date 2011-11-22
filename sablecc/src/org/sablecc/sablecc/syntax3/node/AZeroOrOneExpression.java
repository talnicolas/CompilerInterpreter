/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AZeroOrOneExpression extends PExpression
{
    private PExpression _expression_;
    private TQMark _qMark_;

    public AZeroOrOneExpression()
    {
        // Constructor
    }

    public AZeroOrOneExpression(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TQMark _qMark_)
    {
        // Constructor
        setExpression(_expression_);

        setQMark(_qMark_);

    }

    @Override
    public Object clone()
    {
        return new AZeroOrOneExpression(
            cloneNode(this._expression_),
            cloneNode(this._qMark_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAZeroOrOneExpression(this);
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TQMark getQMark()
    {
        return this._qMark_;
    }

    public void setQMark(TQMark node)
    {
        if(this._qMark_ != null)
        {
            this._qMark_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qMark_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._qMark_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._qMark_ == child)
        {
            this._qMark_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._qMark_ == oldChild)
        {
            setQMark((TQMark) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}