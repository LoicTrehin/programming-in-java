package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

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

    @Test
    void addLast() {
        dLinkList.addLast(18);
        assertEquals(18, dLinkList.bottom());
        System.out.println(dLinkList);
    }

    @Test
    void removeLast() {
        dLinkList.addFirst(21);
        dLinkList.addFirst(7);
        dLinkList.addFirst(3);
        dLinkList.removeLast();
        assertEquals(7, dLinkList.bottom());
        System.out.println(dLinkList);
    }

    @Test
    void removeFirst() {
        dLinkList.addFirst(21);
        dLinkList.addFirst(7);
        dLinkList.addFirst(12);
        dLinkList.removeFirst();
        assertEquals(7, dLinkList.peek() );
    }
}