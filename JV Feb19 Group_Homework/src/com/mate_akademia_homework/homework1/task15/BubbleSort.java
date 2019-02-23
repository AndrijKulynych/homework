package com.mate_akademia_homework.homework1.task15;

import java.util.stream.IntStream;

public class BubbleSort {

        public static void main(String[] args) {

            int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
            int n = numbers.length;

            System.out.println("Длина массива: " + numbers.length);
            System.out.println("1-й ел-т массива до сортир-ки " + numbers[0]);
            System.out.println("1000000-й ел-т массива до сорт-ки " + numbers[numbers.length-1]);
            long startTime = System.currentTimeMillis();//время старт
           bubble_Sort(numbers);
            long spendTime = System.currentTimeMillis()-startTime;// время потрачено
            for (int h = 0; h < n; h++)
                System.out.println(numbers[h]+ " ");
            System.out.println("Длина массива: " + numbers.length);
            System.out.println("1-й ел-т массива после сорт-ки " + numbers[0]);
            System.out.println("1000000-й ел-т массива после сорт-ки " + numbers[numbers.length-1]);
            System.out.println(" ");
            System.out.println("Время сортировки:  " + spendTime);
        }

        public static void bubble_Sort(int[] numbers) {

            int n = numbers.length;
            int temp = 0;

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