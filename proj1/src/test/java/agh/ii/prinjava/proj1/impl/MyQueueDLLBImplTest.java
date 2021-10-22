package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The purpose of this class is to run unit test on the MyQueueDLLBImpl to verify if our methods works perfectly
 */
class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test to verify if the function "enqueue" works correctly
     * To do so, we use the function to add some elements in the queue
     * And we remove an element with "dequeue" and assertEquals to verify if the element was correctly added in the queue and if it's respect the implementation of the queue
     * */
    @Test
    void enqueue() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(17);
        assertEquals(5, queueOfInts.dequeue());
    }

    /**
     * Test to verify if the function "dequeue" works correctly
     * To do so, we use the function "enqueue" to add an element in the queue
     * And we remove it with "dequeue" and assertEquals to verify if the function works correctly and if it's respect the implementation of the queue
     * */
    @Test
    void dequeue() {
        queueOfInts.enqueue(64);
        assertEquals(64, queueOfInts.dequeue());

    }

    /**
     * Test to verify if the function "numOfElems" works correctly
     * To do so, we use the function "enqueue" to add some elements in the queue
     * And we verify with the function "numOfElems" and assertEquals if the function works correctly by giving the good number of elements.
     * */
    @Test
    void numOfElems() {
        queueOfInts.enqueue(64);
        queueOfInts.enqueue(12);
        queueOfInts.enqueue(20);
        queueOfInts.enqueue(23);

        assertEquals(4, queueOfInts.numOfElems());

    }

    /**
     * Test to verify if the function "peek" works correctly
     * To do so, we use the function "enqueue" to add some elements in the queue
     * And we peek it ones with "peek" and assertEquals to verify if the function works correctly
     * */
    @Test
    void peek() {
        queueOfInts.enqueue(74);
        queueOfInts.enqueue(14);
        queueOfInts.enqueue(67);

        assertEquals(74, queueOfInts.peek());
    }
}