package com;

import com.mycollection.MyArrayList;
import com.mycollection.MyLinkedList;
import com.mycollection.MyStack;
import com.exception.NodeIndexOutBoundaryException;
import com.exception.StackEmptyException;


public class Application {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.remove(3);
        list.show();
        System.out.println(list.get(3));
        //list.clear();
        list.show();
        System.out.println("********************");

        MyLinkedList<String> link = new MyLinkedList<>();
        link.add("ab");
        link.add("abc");
        link.add("abcd");
        link.add("abcde");
        link.add("abcdef");
        link.add("abcdefg");
        link.show();
        try {
            link.remove(4);
        } catch (NodeIndexOutBoundaryException e) {
            System.out.println(e.getMessage());
        }
        link.show();
        try {
            String s = link.get(0);
            System.out.println(s);
        } catch (NodeIndexOutBoundaryException e) {
            System.out.println(e.getMessage());
        }
       // link.clear();
        System.out.println(link.size());
        link.show();

        System.out.println("*********************");
        MyStack<String> steck = new MyStack<>();
        steck.push("aaa");
        steck.push("bbb");
        steck.push("ccc");
        steck.push("ddd");
        steck.push("eee");
        steck.push("fff");
        steck.show();
        System.out.println(steck.size());
        try {
            System.out.println(steck.peek());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        try {
            steck.pop();
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        steck.show();
        try {
            steck.remove(2);
        } catch (NodeIndexOutBoundaryException e) {
            System.out.println(e.getMessage());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
       // steck.clear();
        steck.show();
    }
}
