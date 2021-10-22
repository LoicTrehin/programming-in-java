package agh.ii.prinjava.proj1.impl;

import java.util.NoSuchElementException;

public class DLinkList<E> {
    // ...

    private Node<E> head = null;
    private Node<E> tail = null;
    private int DLL_length = 0;

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

    public E peek(){
        return head.elem;
    }

    public  E bottom(){
        return tail.elem;
    }

    public int size() {
        if (head == null) return 0;

        int size = 0;

        for (Node <E> n = head; n !=null; n = n.next) {
            size++;
        }
        return size;

    }

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