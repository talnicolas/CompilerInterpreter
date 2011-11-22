/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AListElementType extends PElementType
{
    private PListType _listType_;

    public AListElementType()
    {
        // Constructor
    }

    public AListElementType(
        @SuppressWarnings("hiding") PListType _listType_)
    {
        // Constructor
        setListType(_listType_);

    }

    @Override
    public Object clone()
    {
        return new AListElementType(
            cloneNode(this._listType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListElementType(this);
    }

    public PListType getListType()
    {
        return this._listType_;
    }

    public void setListType(PListType node)
    {
        if(this._listType_ != null)
        {
            this._listType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listType_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listType_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listType_ == child)
        {
            this._listType_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listType_ == oldChild)
        {
            setListType((PListType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}