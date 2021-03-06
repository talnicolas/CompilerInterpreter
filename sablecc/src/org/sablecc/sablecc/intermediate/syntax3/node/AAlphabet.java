/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AAlphabet extends PAlphabet
{
    private final LinkedList<PSymbol> _symbols_ = new LinkedList<PSymbol>();
    private final LinkedList<PInterval> _intervals_ = new LinkedList<PInterval>();

    public AAlphabet()
    {
        // Constructor
    }

    public AAlphabet(
        @SuppressWarnings("hiding") List<PSymbol> _symbols_,
        @SuppressWarnings("hiding") List<PInterval> _intervals_)
    {
        // Constructor
        setSymbols(_symbols_);

        setIntervals(_intervals_);

    }

    @Override
    public Object clone()
    {
        return new AAlphabet(
            cloneList(this._symbols_),
            cloneList(this._intervals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlphabet(this);
    }

    public LinkedList<PSymbol> getSymbols()
    {
        return this._symbols_;
    }

    public void setSymbols(List<PSymbol> list)
    {
        this._symbols_.clear();
        this._symbols_.addAll(list);
        for(PSymbol e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PInterval> getIntervals()
    {
        return this._intervals_;
    }

    public void setIntervals(List<PInterval> list)
    {
        this._intervals_.clear();
        this._intervals_.addAll(list);
        for(PInterval e : list)
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
            + toString(this._symbols_)
            + toString(this._intervals_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._symbols_.remove(child))
        {
            return;
        }

        if(this._intervals_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PSymbol> i = this._symbols_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSymbol) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PInterval> i = this._intervals_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PInterval) newChild);
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
