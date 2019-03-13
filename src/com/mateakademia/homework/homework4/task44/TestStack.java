package com.mateakademija.homework.homework4.task44;


public class TestStack {

    public static void main (String[] args) {
        MyStack <String> stk = new MyStack();
        stk.push("yyy");
        stk.push("rewqy");
        stk.push("767");
        stk.pop();
        stk.add("888");
       // stk.clear();

        for(String elmnt: stk) {System.out.println(elmnt);}
       // System.out.println(stk.peek());
        System.out.println( "Size of stack is:  " + stk.size());

    }
}
