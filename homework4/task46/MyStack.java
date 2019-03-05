package com.mateakademija.homework.homework4.task46;

import java.util.Vector;

import java.util.EmptyStackException;

class MyStack<E> extends Vector<E> {

    private int mSize;
    private int[] stackArray;
    private int top;

    public MyStack (int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }
//  push, remove, clear, size, peek, pop;

    public int push(int item) {
    addElement( item );
    return  item;
}

    public void addElement (int element) {
        stackArray[++top] = element;
    }

    public int readTop () {
        return stackArray[top];

    }

   public void clearStack() {
            this.top = 0;
    }
    public synchronized E pop() {
        E  obj;
        int  len = size();
        obj = peek();
        removeElementAt(len - 1);
        return obj;
    }


    public synchronized E peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }
}
