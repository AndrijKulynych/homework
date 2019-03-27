package com.mycollection;

public interface List<T> {
       T get (int i);
    void add (T t);
    void clear ();
    int size ();
    void remove (int i);
}
