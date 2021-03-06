/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AAlternative extends PAlternative
{
    private TString _name_;
    private PBoolean _public_;
    private final LinkedList<PElement> _elements_ = new LinkedList<PElement>();

    public AAlternative()
    {
        // Constructor
    }

    public AAlternative(
        @SuppressWarnings("hiding") TString _name_,
        @SuppressWarnings("hiding") PBoolean _public_,
        @SuppressWarnings("hiding") List<PElement> _elements_)
    {
        // Constructor
        setName(_name_);

        setPublic(_public_);

        setElements(_elements_);

    }

    @Override
    public Object clone()
    {
        return new AAlternative(
            cloneNode(this._name_),
            cloneNode(this._public_),
            cloneList(this._elements_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlternative(this);
    }

    public TString getName()
    {
        return this._name_;
    }

    public void setName(TString node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public PBoolean getPublic()
    {
        return this._public_;
    }

    public void setPublic(PBoolean node)
    {
        if(this._public_ != null)
        {
            this._public_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._public_ = node;
    }

    public LinkedList<PElement> getElements()
    {
        return this._elements_;
    }

    public void setElements(List<PElement> list)
    {
        this._elements_.clear();
        this._elements_.addAll(list);
        for(PElement e : list)
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
            + toString(this._name_)
            + toString(this._public_)
            + toString(this._elements_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._public_ == child)
        {
            this._public_ = null;
            return;
        }

        if(this._elements_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((TString) newChild);
            return;
        }

        if(this._public_ == oldChild)
        {
            setPublic((PBoolean) newChild);
            return;
        }

        for(ListIterator<PElement> i = this._elements_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PElement) newChild);
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
