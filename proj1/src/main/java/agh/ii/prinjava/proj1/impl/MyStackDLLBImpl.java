package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.w3c.dom.Node;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems;

    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    @Override
    public E pop() {
        return elems.removeLast();
    }

    @Override
    public void push(E x) {
        elems.addLast(x);
    }

    @Override
    public int numOfElems() {
        return elems.size();
    }

    @Override
    public E peek() {
        return elems.bottom();
    }
}