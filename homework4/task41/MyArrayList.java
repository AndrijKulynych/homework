package com.mateakademija.homework.homework4.task41;


import java.util.Arrays;


public class MyArrayList<E> implements SList <E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private int size;
    protected int modCount = 0;
    transient Object[] elementData = EMPTY_ELEMENTDATA;

    E[] values;
    private int index = 0;

    public MyArrayList () {
        values = (E[]) new Object[DEFAULT_CAPACITY];
         }

    public int size () {
        return values.length;
    }

    @Override
    public E get (int index) {
        return values[index];
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

    @Override
    public void clear () {
        modCount++;
        for (int i = 0; i < values.length; i++)
            values[i] = null;
        size = 0;
    }

    @Override
    public void remove (int i) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            index =i;
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayIterator <E> iterator () {
        return new ArrayIterator <>(values);
    }

    private void ensureCapacityInternal (int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }

    private void ensureExplicitCapacity (int minCapacity) {
        modCount++;
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private static int calculateCapacity (Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private void grow (int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity (int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

}


