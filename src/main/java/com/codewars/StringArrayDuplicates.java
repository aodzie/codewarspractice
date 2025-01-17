package com.codewars;

/*
In this Kata, you will be given an array of strings and your task is to remove all consecutive duplicate letters from each string in the array.

For example:

dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].

dup(["kelless","keenness"]) = ["keles","kenes"].

Strings will be lowercase only, no spaces. See test cases for more examples.
 */

public class StringArrayDuplicates {
    public static String[] dup(String[] arr){
        String [] noDuplicates = new String [arr.length];
        for (int i=0; i<arr.length; i++){
            String word = ""+arr[i].charAt(0);
            for (int j=1; j<arr[i].length(); j++){
                if (arr[i].charAt(j)!=arr[i].charAt(j-1)){
                    word += arr[i].charAt(j);
                }
            }
            noDuplicates[i] = word;
        }
        return noDuplicates;
    }
}
