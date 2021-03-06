/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AParserInvestigator extends PParserInvestigator
{
    private TInvestigatorKeyword _investigatorKeyword_;
    private TIdentifier _name_;
    private final LinkedList<TIdentifier> _parameters_ = new LinkedList<TIdentifier>();

    public AParserInvestigator()
    {
        // Constructor
    }

    public AParserInvestigator(
        @SuppressWarnings("hiding") TInvestigatorKeyword _investigatorKeyword_,
        @SuppressWarnings("hiding") TIdentifier _name_,
        @SuppressWarnings("hiding") List<TIdentifier> _parameters_)
    {
        // Constructor
        setInvestigatorKeyword(_investigatorKeyword_);

        setName(_name_);

        setParameters(_parameters_);

    }

    @Override
    public Object clone()
    {
        return new AParserInvestigator(
            cloneNode(this._investigatorKeyword_),
            cloneNode(this._name_),
            cloneList(this._parameters_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParserInvestigator(this);
    }

    public TInvestigatorKeyword getInvestigatorKeyword()
    {
        return this._investigatorKeyword_;
    }

    public void setInvestigatorKeyword(TInvestigatorKeyword node)
    {
        if(this._investigatorKeyword_ != null)
        {
            this._investigatorKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._investigatorKeyword_ = node;
    }

    public TIdentifier getName()
    {
        return this._name_;
    }

    public void setName(TIdentifier node)
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

    public LinkedList<TIdentifier> getParameters()
    {
        return this._parameters_;
    }

    public void setParameters(List<TIdentifier> list)
    {
        this._parameters_.clear();
        this._parameters_.addAll(list);
        for(TIdentifier e : list)
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
            + toString(this._investigatorKeyword_)
            + toString(this._name_)
            + toString(this._parameters_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._investigatorKeyword_ == child)
        {
            this._investigatorKeyword_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._parameters_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._investigatorKeyword_ == oldChild)
        {
            setInvestigatorKeyword((TInvestigatorKeyword) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TIdentifier) newChild);
            return;
        }

        for(ListIterator<TIdentifier> i = this._parameters_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TIdentifier) newChild);
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
