package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The goal of this class is to run some unit test on the DLinkListTest to verify if our methods works well.
 */
class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test to verify if the function "addFirst" works well
     * This is a test to verify if the function "addFirst" do that we need
     * To do so, we use the methods "addFirst" to add some nodes in the list
     * And we use "peek" and assertEquals to verify if the element was correctly implemented in our list
     * */
    @Test
    void addFirstTest() {
        dLinkList.addFirst(40);
        dLinkList.addFirst(43);
        dLinkList.addFirst(41);
        dLinkList.addFirst(44);
        dLinkList.addFirst(39);
        dLinkList.addFirst(21);
        assertEquals(21, dLinkList.peek());
        System.out.println(dLinkList);
    }

    /**
     * Test to verify if the function "addLast" works well
     * To do so, we use the methods to add element in the list
     * And we use the methods "bottom" and assertEquals to check if the element was correctly implemented in our list or note
     * */
    @Test
    void addLast() {
        dLinkList.addLast(18);
        assertEquals(18, dLinkList.bottom());
        System.out.println(dLinkList);
    }

    /**
     * Test to verify if the function "removeLast" works well
     * To do so, we use the function "addFirst" to add some elements in the list
     * And we use the function "bottom" and assertEquals to verify if the element was correctly remove from the list
     * */
    @Test
    void removeLast() {
        assertThrows(NoSuchElementException.class, () -> dLinkList.removeLast());
        dLinkList.addFirst(21);
        dLinkList.addFirst(7);
        dLinkList.addFirst(3);
        dLinkList.removeLast();
        assertEquals(7, dLinkList.bottom());
        System.out.println(dLinkList);
    }

    /**
     * Test to verify if the function "removeFirst" works correctly
     * To do so, we use the function "addFirst" to add some elements in the list
     * And we use the function "peek" and assertEquals to verify if the element was correctly remove from the list
     * */
    @Test
    void removeFirst() {
        assertThrows(NoSuchElementException.class, () -> dLinkList.removeFirst());
        dLinkList.addFirst(21);
        dLinkList.addFirst(7);
        dLinkList.addFirst(12);
        dLinkList.removeFirst();
        assertEquals(7, dLinkList.peek() );
        System.out.println(dLinkList);
    }
}