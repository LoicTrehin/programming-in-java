package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    @Override
    public int numOfElems() {
        return elems.size();
    }

    @Override
    public E peek() {
        return elems.peek();
    }

}