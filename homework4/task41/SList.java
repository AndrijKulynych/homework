package com.mateakademija.homework.homework4.task41;

public interface SList<E> extends Iterable<E> {
    E get(int index);
    void add (E e);
    void remove (int index);
    int size ();
}
