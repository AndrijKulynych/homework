package com.mate_akademia_homework.homework1.task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SelectionSort {

        public static void main(String[] args) {


            int[] numbers = IntStream.generate(() -> (int) (Math.random()*(2533111+1))-2000).limit(100000).toArray();
            System.out.println("Длина массива: " + numbers.length);
            System.out.println("1-й ел-т массива до сортир-ки " + numbers[0]);
            System.out.println("1000000-й ел-т массива до сорт-ки " + numbers[numbers.length-1]);

            int n = numbers.length;
                 long startTime = System.currentTimeMillis();//время старт
            selectionSort(numbers, 0, n - 1);
                 long spendTime = System.currentTimeMillis()-startTime;// время потрачено
            for (int i = 0; i < n; i++)
                System.out.println(numbers[i] + " ");
            System.out.println("Длина массива: " + numbers.length);
            System.out.println("1-й ел-т массива после сорт-ки " + numbers[0]);
            System.out.println("1000000-й ел-т массива после сорт-ки " + numbers[numbers.length-1]);
            System.out.println(" ");
            System.out.println("Время сортировки:  " + spendTime);
        }
//**************Сортировка выбором****************************************************
        // Selection sort algorithm
        public static void selectionSort(int[] numbers, int low, int high) {
            for (int h = low; h <= high; h++)
                swap(numbers, h, getSmallest(numbers, h, high));
        }

        // Get the position of the smallest value from numbers[low] to numbers[high]
        public static int getSmallest(int[] numbers, int low, int high) {
            int small = low;
            for (int i = low + 1; i <= high; i++)
                if (numbers[i] < numbers[small])
                    small = i;
            return small;
        }

        // swap numbers
        public static void swap(int[] numbers, int i, int j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
//************************************************************************
    }
