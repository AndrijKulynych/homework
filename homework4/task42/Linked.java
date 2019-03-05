package com.mateakademija.homework.homework4.task42;

public interface Linked <E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
  E  getElementByIndex (int counter);
}
