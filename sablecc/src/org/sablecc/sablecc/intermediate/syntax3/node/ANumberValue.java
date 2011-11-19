/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ANumberValue extends PValue
{
    private TString _unit_;
    private PBoolean _publicUnit_;
    private TNumber _number_;
    private final LinkedList<PListValue> _listValues_ = new LinkedList<PListValue>();

    public ANumberValue()
    {
        // Constructor
    }

    public ANumberValue(
        @SuppressWarnings("hiding") TString _unit_,
        @SuppressWarnings("hiding") PBoolean _publicUnit_,
        @SuppressWarnings("hiding") TNumber _number_,
        @SuppressWarnings("hiding") List<PListValue> _listValues_)
    {
        // Constructor
        setUnit(_unit_);

        setPublicUnit(_publicUnit_);

        setNumber(_number_);

        setListValues(_listValues_);

    }

    @Override
    public Object clone()
    {
        return new ANumberValue(
            cloneNode(this._unit_),
            cloneNode(this._publicUnit_),
            cloneNode(this._number_),
            cloneList(this._listValues_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberValue(this);
    }

    public TString getUnit()
    {
        return this._unit_;
    }

    public void setUnit(TString node)
    {
        if(this._unit_ != null)
        {
            this._unit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unit_ = node;
    }

    public PBoolean getPublicUnit()
    {
        return this._publicUnit_;
    }

    public void setPublicUnit(PBoolean node)
    {
        if(this._publicUnit_ != null)
        {
            this._publicUnit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._publicUnit_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    public LinkedList<PListValue> getListValues()
    {
        return this._listValues_;
    }

    public void setListValues(List<PListValue> list)
    {
        this._listValues_.clear();
        this._listValues_.addAll(list);
        for(PListValue e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unit_)
            + toString(this._publicUnit_)
            + toString(this._number_)
            + toString(this._listValues_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unit_ == child)
        {
            this._unit_ = null;
            return;
        }

        if(this._publicUnit_ == child)
        {
            this._publicUnit_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        if(this._listValues_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unit_ == oldChild)
        {
            setUnit((TString) newChild);
            return;
        }

        if(this._publicUnit_ == oldChild)
        {
            setPublicUnit((PBoolean) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        for(ListIterator<PListValue> i = this._listValues_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PListValue) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
