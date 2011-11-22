/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.intermediate.syntax3.node;

import org.sablecc.objectmacro.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AParamInsertMacroPart extends PMacroPart
{
    private TString _paramInsert_;

    public AParamInsertMacroPart()
    {
        // Constructor
    }

    public AParamInsertMacroPart(
        @SuppressWarnings("hiding") TString _paramInsert_)
    {
        // Constructor
        setParamInsert(_paramInsert_);

    }

    @Override
    public Object clone()
    {
        return new AParamInsertMacroPart(
            cloneNode(this._paramInsert_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParamInsertMacroPart(this);
    }

    public TString getParamInsert()
    {
        return this._paramInsert_;
    }

    public void setParamInsert(TString node)
    {
        if(this._paramInsert_ != null)
        {
            this._paramInsert_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramInsert_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paramInsert_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paramInsert_ == child)
        {
            this._paramInsert_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._paramInsert_ == oldChild)
        {
            setParamInsert((TString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}