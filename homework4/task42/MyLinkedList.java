package com.mateakademija.homework.homework4.task42;

import javax.xml.soap.Node;
import java.util.LinkedList;

public class MyLinkedList<E> implements Linked <E> {

    static final int BATCH_UNIT = 1 << 10;
    static final int MAX_BATCH = 1 << 25;
    Node <E> current;
    int est;

    private Node <E> frstNode;
    private Node <E> lstNode;
    private int size = 0;


    public MyLinkedList () {

        lstNode = new Node <E>(null, frstNode, null);
        frstNode = new Node <E>(null, null, lstNode);
    }

    @Override
    public void addFirst (E e) {
        Node <E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node <E>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }


    @Override
    public int size () {
        return size;
    }

    @Override
    public E getElementByIndex (int counter) {
        Node <E> target = frstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    
    private Node <E> getNextElement (Node <E> current) {
        return current.getNextElement();
    }


    private class Node<E> {
        private E currentElement;
        private Node <E> nextElement;
        private Node <E> prevElement;

        public Node (E currentElement, Node <E> nextElement, Node <E> prevElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement () {
            return currentElement;
        }

        public void setCurrentElement (E currentElement) {
            this.currentElement = currentElement;
        }

        public Node <E> getNextElement () {
            return nextElement;
        }

        public void setNextElement (Node <E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node <E> getPrevElement () {
            return prevElement;
        }

        public void setPrevElement (Node <E> prevElement) {
            this.prevElement = prevElement;
        }
    }


}