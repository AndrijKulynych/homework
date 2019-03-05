package com.mateakademija.homework.homework4.task42;

import javax.xml.soap.Node;

public class LinkedContainer <E> implements Linked <E>{

    public static void main (String[] args) {
        Linked<String> stringLinked = new LinkedContainer <> ();
        stringLinked.addLast("mat");

        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
    }

private Node <E> frstNode;
private Node <E> lstNode;
private int size = 0;

    public LinkedContainer () {
        lstNode  = new Node<E>(null,frstNode,null);
        frstNode  = new Node<E>(null,null,lstNode) ;
    }

      @Override
    public void addLast (E e) {
     Node <E> prev = lstNode;
         prev.setCurrentElement(e);
         lstNode = new Node <E>(null, prev, null);
     prev.setNextElement(lstNode);
     size++;
    }

    @Override
    public void addFirst (E e) {

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

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }


    private  class Node <E>{
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
