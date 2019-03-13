package com.mateakademija.homework.homework4.task42;


public class MyLinkedList<T> implements Linked <T> {

    private int size = 0;
    private MyLinkedList.Node <T> first;
    private MyLinkedList.Node <T> last;
    private int modCount = 0;

    private static class Node<T> {
        T item;
        MyLinkedList.Node<T> next;
        MyLinkedList.Node<T> prev;

        Node(MyLinkedList.Node<T> prev, T element, MyLinkedList.Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }


    public MyLinkedList () {
        this.size = 0;
    }


    private void linkFirst(T t) {
        final MyLinkedList.Node<T> f = first;
        final MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(null, t, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

    void linkLast(T t) {
        final MyLinkedList.Node<T> l = last;
        final MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(l, t, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    void linkBefore(T t, MyLinkedList.Node<T> succ) {
        // assert succ != null;
        final MyLinkedList.Node<T> pred = succ.prev;
        final MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(pred, t, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }


    private T unlinkFirst(MyLinkedList.Node<T> f) {
        final T element = f.item;
        final MyLinkedList.Node<T> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }


    private T unlinkLast(MyLinkedList.Node<T> l) {
        final T element = l.item;
        final MyLinkedList.Node<T> prev = l.prev;
        l.item = null;
        l.prev = null;
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        modCount++;
        return element;
    }


    T unlink(MyLinkedList.Node<T> x) {
        final T element = x.item;
        final MyLinkedList.Node<T> next = x.next;
        final MyLinkedList.Node<T> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    public int size () {
        return this.size;
    }

    public void add (T var1) {
        this.linkLast(var1);
    }

    public void add (int index, T element) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }


    public T get (int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    public T remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    public void clear () {
        for (MyLinkedList.Node <T> x = first; x != null; ) {
            MyLinkedList.Node <T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
        modCount++;
    }


   MyLinkedList.Node<T> node(int index) {


       if (index < (size >> 1)) {
           MyLinkedList.Node<T> x = first;
           for (int i = 0; i < index; i++)
               x = x.next;
           return x;
       } else {
           MyLinkedList.Node<T> x = last;
           for (int i = size - 1; i > index; i--)
               x = x.prev;
           return x;
       }
   }




    private boolean isElementIndex (int var1) {
        return var1 >= 0 && var1 < this.size;
    }

    private boolean isPositionIndex (int var1) {
        return var1 >= 0 && var1 <= this.size;
    }

    private String outOfBoundsMsg (int var1) {
        return "Index: " + var1 + ", Size: " + this.size;
    }

    private void checkElementIndex (int var1) {
        if (!this.isElementIndex(var1)) {
            throw new IndexOutOfBoundsException(this.outOfBoundsMsg(var1));
        }
    }

    private void checkPositionIndex (int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }


}


