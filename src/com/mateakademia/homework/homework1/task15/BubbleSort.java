package com.mateakademija.homework1.task15;

import java.util.stream.IntStream;

public class BubbleSort {

        public static void main(String[] args) {
            int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
            int n = numbers.length;
            System.out.println("Array length: " + numbers.length);
            System.out.println("1-st element of array  before sort : "  + numbers[0]);
            System.out.println("Last element of array  before sort : " + numbers[numbers.length-1]);
            long startTime = System.currentTimeMillis();
            bubble_Sort(numbers);
            long spendTime = System.currentTimeMillis()-startTime;
            for (int h = 0; h < n; h++) {
                System.out.println(numbers[h] + " ");
            }
            System.out.println("Array length: " + numbers.length);
            System.out.println("1-st element of array  after sort : " + numbers[0]);
            System.out.println("Last element of array  after sort : " + numbers[numbers.length-1]);
            System.out.println(" ");
            System.out.println(" Spend time for sorting: " + spendTime);
        }

        public static void bubble_Sort(int[] numbers) {
            int n = numbers.length;
            int temp ;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (numbers[j - 1] > numbers[j]) {
                        //swap elements
                        temp = numbers[j - 1];
                        numbers[j - 1] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
    }