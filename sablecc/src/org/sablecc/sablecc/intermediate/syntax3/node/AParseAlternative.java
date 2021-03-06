/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AParseAlternative extends PParseAlternative
{
    private TString _name_;
    private final LinkedList<PParseElement> _parseElements_ = new LinkedList<PParseElement>();
    private final LinkedList<PTransformation> _transformations_ = new LinkedList<PTransformation>();

    public AParseAlternative()
    {
        // Constructor
    }

    public AParseAlternative(
        @SuppressWarnings("hiding") TString _name_,
        @SuppressWarnings("hiding") List<PParseElement> _parseElements_,
        @SuppressWarnings("hiding") List<PTransformation> _transformations_)
    {
        // Constructor
        setName(_name_);

        setParseElements(_parseElements_);

        setTransformations(_transformations_);

    }

    @Override
    public Object clone()
    {
        return new AParseAlternative(
            cloneNode(this._name_),
            cloneList(this._parseElements_),
            cloneList(this._transformations_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParseAlternative(this);
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

    public LinkedList<PParseElement> getParseElements()
    {
        return this._parseElements_;
    }

    public void setParseElements(List<PParseElement> list)
    {
        this._parseElements_.clear();
        this._parseElements_.addAll(list);
        for(PParseElement e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PTransformation> getTransformations()
    {
        return this._transformations_;
    }

    public void setTransformations(List<PTransformation> list)
    {
        this._transformations_.clear();
        this._transformations_.addAll(list);
        for(PTransformation e : list)
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
            + toString(this._parseElements_)
            + toString(this._transformations_);
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

        if(this._parseElements_.remove(child))
        {
            return;
        }

        if(this._transformations_.remove(child))
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

        for(ListIterator<PParseElement> i = this._parseElements_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParseElement) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PTransformation> i = this._transformations_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTransformation) newChild);
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
