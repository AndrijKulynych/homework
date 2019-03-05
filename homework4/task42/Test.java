package com.mateakademija.homework.homework4.task42;

public class Test {
    public static void main (String[] args) {
        Linked<String> stringLinked = new LinkedContainer <> ();
        stringLinked.addLast("mateakadem");
        stringLinked.addLast("codder");
        stringLinked.addLast("juvist");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
    }
}
