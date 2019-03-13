package com.mateakademija.homework.homework4.task41;

public interface SList<T> extends Iterable <T> {
    T get (int index);

    void add (int i, T e);
    void add (T e);

    void remove (int index);

    void clear ();
    int size();
}
