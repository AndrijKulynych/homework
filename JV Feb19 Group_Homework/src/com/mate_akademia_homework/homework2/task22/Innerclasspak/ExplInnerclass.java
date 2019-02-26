package com.mate_akademia_homework.homework2.task22.Innerclasspak;

public class ExplInnerclass {
    public static void main(String[] args) {
        ExplInnerclass.Inner inner = new ExplInnerclass().new Inner();
        inner.myVoice();
    }

    class Inner {
            public void myVoice() {
                System.out.println("Hi, mateakedemiya javacoders! ");
            }
        }

    }

