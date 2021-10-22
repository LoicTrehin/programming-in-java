package agh.ii.prinjava.proj1.impl;

import java.util.NoSuchElementException;
/**
 * The goal of this class is to implement a double linked list
 * @param <E>, this is the value of an element that we store in our double linked list, it can be of different types, for example : int, String ect...
 */
public class DLinkList<E> {
    // ...
    /**
     * head and tail Node are the variable that we use to implements the list
     */

    private Node<E> head = null;
    private Node<E> tail = null;
    private int DLL_length = 0;

    /**
     * The goal of this method is to add a new element at the beginning of our list
     * We create a new node
     * We verify if the list is empty and we modify the pointing attributes
     * @param nVal, the value of anyone type we need to add to the list
     */
    public void addFirst(E nVal){
        Node<E> nNode = new Node<>(nVal, null, null);
        if(head == null) {
            head = nNode;
            tail = nNode;
        } else {
            head.prev = nNode;
            nNode.next = head;
            head = head.prev;
        }
    }
    /**
     * The goal of this method is to add a new element at the end of our list
     * We create a new node
     * We verify if the list is empty and we modify the pointing attributes
     * @param nVal, the value of anyone type we need to add to the list
     */
    public void addLast(E nVal){
        Node<E> nNode =  new Node<>(nVal, null, null);
        if (tail == null){
            head = nNode;
            tail = nNode;
        } else {
            tail.next = nNode;
            nNode.prev = tail;
            tail = tail.next;
        }
    }

    /**
     * The goal of this method is to remove the first elements of the double linked list
     * if the list is empty, we cannot remove and we catch an exception
     * if we want to remove the last element of our list we put head and tail node to null
     * if there are another elements in the list, we will modify the references to the previous and next element to the list
     * @return the value stored by the element we just taked of from the list
     */
    public E removeFirst(){
        if (head == null){
            throw new NoSuchElementException("No element to remove! List is now empty");

        }
        Node <E> temp = head;
        if (head == tail){
            tail = null;
        }
        else {
            head.next.prev = null;
        }
        head= head.next;
        temp.next = null;
        return temp.elem;
    }

    /**
     * The goal of this method is to remove the last elements of the double linked list
     * if the list is empty, we cannot remove and catch an exception
     * if we want to remove the last element of the list we put head and tail node to null
     * if there are another in the list, we will modify the references to the previous and next element to the list
     * @return the value stored by the element we just taked off from the list
     */
    public E removeLast(){
        if ( tail == null){
            throw new NoSuchElementException("No element to remove! List is now empty");
        }
        Node <E> temp = tail;
        if(head == tail){
            head = null;
        }else {
            tail.prev.next = null;
        }

        tail = tail.prev;
        temp.prev = null;
        return temp.elem;

    }

    /**
     * The purpose of this method is to access to the value contained by the head node in the list
     * @return the value contained by the first node
     */
    public E peek(){
        return head.elem;
    }

    /**
     * The purpose of this method is to acess the value contained by the tail node in the list
     * @return the value contained by the last node
     */
    public  E bottom(){
        return tail.elem;
    }
    /**
     * this method allows us to know the number of elements contained by the double linked list
     * @return the size of the list
     */
    public int size() {
        if (head == null) return 0;

        int size = 0;

        for (Node <E> n = head; n !=null; n = n.next) {
            size++;
        }
        return size;

    }

    /**
     * toString() this method will return the values of each instance of the double linked list
     * @return a string containing all the information we need to know, like all the nodes and the final tall
     */
    @Override
    public String toString() {
        if (head == null) {
            return "List Empty !";
        }
        Node <E> toPrint = head;
        String text = "";
        int i=0;
        while(toPrint != null){
            i++;
            if (!text.equals("")) {
                text = text + "node n " + i + " : " + toPrint.elem + ", ";
            }
            else {
                text = " ";
            }
            toPrint = toPrint.next;
            if (toPrint != null) {
                if (toPrint.next == null){
                    toPrint = null;
                }
            }
        }
        return "DLinkList{" +
                "Head =" + head.elem + text +
                " tail =" + tail.elem + ", size :"+ size() + " }";
    }


    /**
     * We create a nested class Node that we use to build our list and it's constructor to initialize it's attributes
     * The first element contain a value of any type, the second one, is a reference to the previous node in the  double linked list
     * the last element is a reference to the following node coming in the list
     * @param <T> the node can store element of any types.
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }
}