package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The purpose of this class is to run unit test on the MyQueueDLLBImpl to verify if our methods works perfectly
 */
class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test to verify if the function "push" works correctly
     * To do so, we use the function to add an element in the stack
     * And we remove this element with "pop" and assertEquals to verify if the element was correctly removed from the stack and if it's respect the implementation of the stack
     * */
    @Test
    void pop() {
        stackOfInts.push(11);
        assertEquals(11, stackOfInts.pop());
        assertEquals(0, stackOfInts.numOfElems());

    }

    /**
     * Test to verify if the function "push" works correctly
     * To do so, we use the function to add an element in the stack
     * And we verify with the function "peek" and assertEquals to verify if the element was correctly added in the stack and if it's respect the implementation of the stack
     * */
    @Test
    void push() {
        stackOfInts.push(36);
        assertEquals(36, stackOfInts.peek());
    }

    /**
     * Test to verify if the function "numOfElems" works correctly
     * To do so, we use the function "push" to add some elements in the stack
     * And we verify with the function "numOfElems" and assertEquals if the function works correctly by giving the good number of elements.
     * */
    @Test
    void numOfElems() {
        stackOfInts.push(12);
        stackOfInts.push(13);
        stackOfInts.push(21);
        stackOfInts.push(25);

        assertEquals(4, stackOfInts.numOfElems());

    }

    /**
     * Test to verify if the function "peek" works correctly
     * To do so, we use the function "push" to add some elements in the stack
     * And we peek it ones with "peek" and assertEquals to verify if the function works correctly
     * */
    @Test
    void peek() {
        stackOfInts.push(13);
        stackOfInts.push(43);
        assertEquals(43, stackOfInts.peek());
    }
}