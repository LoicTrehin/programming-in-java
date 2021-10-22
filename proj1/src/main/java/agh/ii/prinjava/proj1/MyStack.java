package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * This interface allows us to instanciate and maintain a stack implemented thanks a doubly linked list
 * @param <E>, value stored in the stack can be of indetermine type
 */
public interface MyStack<E> {
    /**
     * pop() is going to delete the node at the top of the stack
     * @return E,  the value of the deleted element
     */
    E pop();

    /** push() is going to attach a new Node at the top of the stack
     * @param x, value of the node to include
     */
    void push(E x);

    /**
     * The function to check if there are still elements in our Stack
     * @return a boolean value: false if there are still elements in our stack, true if it is empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * numOfElems is counting the amount of Nodes in my stack
     * @return the number of nodes in the stack
     */
    int numOfElems();

    /**
     * peek() gives the value at the top of the stack
     * @return myPeek, the value at the top of the stack
     */
    E peek();

    /**
     * A function to create a stack data structure
     * @param <T>, the type of the element stored in myStack
     * @return MyStackDLLBImpl, the new stack created
     */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}