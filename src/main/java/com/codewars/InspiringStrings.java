package com.codewars;

/*
Given a string of space separated words, return the longest word.
If there are multiple longest words, return the rightmost longest word.

Examples
"red white blue"  =>  "white"
"red blue gold"   =>  "gold"
 */

public class InspiringStrings {
    public static String longestWord(String wordString) {
        String [] arr = wordString.split(" ");
        String theLongest = "";
        int l = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i].length()>=l){
                theLongest = arr[i];
                l=arr[i].length();
            }
        }
        return theLongest;
    }
}
