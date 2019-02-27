package com.mateakademia.homework.homework2.task22.Nestedclasspak;

public class Solution {

        static class Innerclass {
            public void show() {
                System.out.println("I'm all understood!");
            }
        }

        public static void main(String[] args) {
            Solution.Innerclass inner = new Solution.Innerclass();
            inner.show();
        }


}
