package com.mate_akademia_homework.homework1.task12;


public class Solution1 {
    private static final String  cnst1 = " ";
    private static final String  cnst2 = "*";

    public static void main (String[] args) {
        System.out.println(drawRomb(7));
    }
    //Object dummy=condition? callFunction(parameters): null;
    private static String getElmnt(boolean abc) {
        String str = abc ? cnst1 : cnst2;
        return str;
    }
    private static String drawRomb (int middleStarCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < middleStarCount * 2; i++) {
            if (i < middleStarCount) {
                int offset = middleStarCount - i;
                for (int j = 0; j < middleStarCount; j++) {
                    //String largerNum = lowNum < highNum ? highNum : lowNum;
                    result.append(getElmnt(j < offset || (i - j) * offset < offset));
                }
            }
            else {
                int offset = i - middleStarCount;
                for (int j = 0; j < middleStarCount; j++) {
                    result.append(getElmnt(j < offset || (middleStarCount - j) - 1 < offset));
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
