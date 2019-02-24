package com.mate_akademia_homework.homework1.task12;


public class Solution1 {

    public static void main (String[] args) {

        System.out.println(drawRomb(7));
    }


    private static String ABC (boolean abc) {
        String stroka = abc ? " " : "*";
        return stroka;
    }

    private static String drawRomb (int middleStarCount) {
        StringBuilder result = new StringBuilder();


        for (int i = 1; i < middleStarCount * 2; i++) {
            if (i < middleStarCount) {
                int offset = middleStarCount - i;
                for (int j = 0; j < middleStarCount; j++) {

                    result.append(ABC(j < offset || (i - j) * offset < offset));
                }
            }
            else {
                int offset = i - middleStarCount;
                for (int j = 0; j < middleStarCount; j++) {

                    result.append(ABC(j < offset || (middleStarCount - j) - 1 < offset));
                }
            }
            result.append("\n");
        }
        return result.toString();
    }


}
