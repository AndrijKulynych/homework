package com.mateakademija.homework2.task22.Innerclasspak;

public class ExplInnerClass {
    public static void main(String[] args) {
        ExplInnerClass.Inner inner = new ExplInnerClass().new Inner();
        inner.myVoice();
    }

    class Inner {
            public void myVoice() {
                System.out.println("Hi, mateakedemiya javacoders! ");
            }
        }

    }

