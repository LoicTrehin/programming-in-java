package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * The interface MyQueue declares all the signatures of the method required in order to implement a queue data structure
 * Then we will implement those methods in the class MyQueueDLLBlmplTest
 * This includes 5 central methods:
 * enqueue: add element to the queue
 * dequeue: remove the first element we add to the queue
 * isEmpty: know if our queue contains elements or not
 * numOfElements: number of elements stored in the queue
 * peek: first element stored in the list
 *
 */
public interface MyQueue<E> {

    /**
     * add a new element to the queue
     * @param x, the variable x represents the value we want to add in the queue
     */
    void enqueue(E x);

    /**
     * delete the first element we add to the list
     * @return el, the value in the node we just deleted
     */
    E dequeue();

    /**
     * know whether or not the queue isEmpty
     * @return it returns a boolean value depending of the result, by default, the queue will be considered to be empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * count the number of node present in our queue
     * @return an integer giving the number of nodes currently kept in the memory of the queue
     */
    int numOfElems();

    /**
     * A function to get the first element in the list, that is to say the first we added to it
     * @return the value which has been the first to be pushed in the queue
     */
    E peek();

    /**
     *create a queue data structure
     * @param <T> the type of the elements stored in myQueue
     * @return the queue we just instanciate
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
