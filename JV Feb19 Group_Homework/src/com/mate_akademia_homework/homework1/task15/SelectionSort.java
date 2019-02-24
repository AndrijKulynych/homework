package com.mate_akademia_homework.homework1.task15;


import java.util.Scanner;
import java.util.stream.IntStream;

public class SelectionSort {

        public static void main(String[] args) {
            //int[] numbers = {12,2,13,44,55,1,0};
            int[] numbers = IntStream.generate(() -> (int) (Math.random()*(2533111+1))-2000).limit(1000000).toArray();
            System.out.println("Array length: " + numbers.length);
            System.out.println("1-st element of array  before sort : "  + numbers[0]);
            System.out.println("Last element of array  before sort : " + numbers[numbers.length-1]);
            int n = numbers.length;
                 long startTime = System.currentTimeMillis();
            selectionSort(numbers, 0, n - 1);
                 long spendTime = System.currentTimeMillis()-startTime;
            for (int i = 0; i < n; i++) {
                System.out.println(numbers[i] + " ");
            }
            System.out.println("Array length: " + numbers.length);
            System.out.println("1-st element of array  after sort : " + numbers[0]);
            System.out.println("Last element of array  after sort : " + numbers[numbers.length-1]);
            System.out.println(" ");
            System.out.println(" Spend time for sorting: " + spendTime);
        }
        // Selection sort algorithm
        public static void selectionSort(int[] numbers, int low, int high) {
            for (int h = low; h <= high; h++) {
                swap(numbers, h, getSmallest(numbers, h, high));
            }
        }

        public static int getSmallest(int[] numbers, int low, int high) {
            int small = low;
            for (int i = low + 1; i <= high; i++) {
                if (numbers[i] < numbers[small]) {
                    small = i;
                }
            }
            return small;
        }

        public static void swap(int[] numbers, int i, int j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
}
