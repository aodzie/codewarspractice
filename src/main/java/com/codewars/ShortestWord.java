package com.codewars;

/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */

public class ShortestWord {
    public static int findShort(String s) {
        String [] arr = s.split(" ");
        int shortest=arr[0].length();
        for(int i = 1; i< arr.length; i++){
            if(arr[i].length()<shortest){
                shortest=arr[i].length();
            }
        }
        return shortest;
    }
}
