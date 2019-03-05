package com.mateakademija.homework.homework4.task41;

public class MyArrayList<E> implements SList <E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private int size;
    protected  int modCount = 0;
    transient Object[] elementData = EMPTY_ELEMENTDATA;

    E[] values;
    private int index = 0;

    public MyArrayList () {
        values = (E[]) new Object[10];
    }

    @Override
    public int size () {
        return values.length;
    }

    @Override
    public E get (int index) {
        return  values [index];
    }

    @Override
    public void add (E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    public void clear() {
        modCount++;
        for (int i = 0; i < size; i++)
            elementData[i] = null;
        size = 0;
    }


    @Override
    public void remove (int i) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length -1];
            int amountElemAfterIndex = temp.length - index -1;
            System.arraycopy( temp,0, values, 0, index);
            System.arraycopy(temp, index +1, values, index, amountElemAfterIndex);
            } catch (ClassCastException ex) {
            ex.printStackTrace();
        }



    }

    @Override
    public ArrayIterator <E> iterator () {
        return  new ArrayIterator < > (values);

    }
}


