package com.codewars;

/*
Given an integer n and two other values, build an array of size n filled with these two values alternating.

Examples
5, true, false     -->  [true, false, true, false, true]
10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
0, "one", "two"    -->  []
 */

public class LengthAndTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String [] valuesAlternating = new String[n];
        if (n>0){
            valuesAlternating[0]=firstValue;
            for (int i=1;i<valuesAlternating.length; i++){
                if(valuesAlternating[i-1].equals(firstValue)){
                    valuesAlternating[i] = secondValue;
                }
                else valuesAlternating[i] = firstValue;
            }
        }
        return valuesAlternating;
    }
}
