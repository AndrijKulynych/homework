package com.mateakademia.homework6;

import java.util.Arrays;

public class Start {

        public static void main(String[] args) {

            FlowerStore st = new FlowerStore();

            System.out.println(Arrays.toString(st.sell(3, 5, 3)));
            System.out.println("Income to wallet: " + st.getWallet()+"UAH"+"\n");

            System.out.println(Arrays.toString(st.sellSequence(5, 3, 1)));
            System.out.println("Income to wallet: " + st.getWallet()+"UAH");
        }
    }

