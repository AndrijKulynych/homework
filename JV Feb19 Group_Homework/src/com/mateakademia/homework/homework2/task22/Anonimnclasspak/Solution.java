package com.mateakademia.homework.homework2.task22.Anonimnclasspak;

   class Javist{
        void writeCod(){
            System.out.println("Java - best codding");
        }
    }

    public class Solution {
        public static void main (String[] args) throws Exception {
            Javist javist = new Javist() {
                void writeCod () {
                    System.out.print("Java is the best language");
                }
            };
            javist.writeCod();
        }

    }