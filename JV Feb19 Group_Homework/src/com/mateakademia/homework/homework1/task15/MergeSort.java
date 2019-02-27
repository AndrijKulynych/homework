package com.mateakademia.homework.homework1.task15;

import java.util.stream.IntStream;

public class MergeSort {
    public static void main(String[] args) {
       int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
        int n = numbers.length;
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  before sort : "  + numbers[0]);
        System.out.println("Last element of array  before sort : " + numbers[numbers.length-1]);
        long startTime = System.currentTimeMillis();
        mergeSort(numbers, 0, n - 1);
        long spendTime = System.currentTimeMillis()-startTime;
        for (int h = 0; h < numbers.length; h++) {
            System.out.println(numbers[h] + " ");
        }
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length-1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + spendTime);
    }

    public static void mergeSort(int[] elements, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(elements, low, mid);
            mergeSort(elements, mid + 1, high);
            merge(elements, low, mid, high);
        }
    }
    private static void merge(int[] subset, int low, int mid, int high) {
        int n = high-low+1;
        int[] Temp = new int[n];
        int i = low, j = mid + 1;
        int k = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                Temp[k++] = subset[j++];
            }
            else if (j > high) {
                Temp[k++] = subset[i++];
            }
            else if (subset[i] < subset[j]) {
                Temp[k++] = subset[i++];
            }
            else {
                Temp[k++] = subset[j++];
            }
        }
        for (j = 0; j < n; j++) {
            subset[low + j] = Temp[j];
        }
    }
}