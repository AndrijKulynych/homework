package com.mateakademija.homework.homework4.task42;

public interface Linked <T> {
    T get (int index);

    void add (int i, T t);
    void add (T t);

    T remove (int index);

    void clear ();
    int size();
}
