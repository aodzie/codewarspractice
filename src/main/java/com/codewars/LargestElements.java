package com.codewars;

/*
Write a program that outputs the top n elements from a list.

Example:

largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})
// => new int[]{6, 7}
 */

import java.util.*;

public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        int[] nLargests = new int [n];
        int i=0;
        while(i<n){
            nLargests[n-i-1] = arr[arr.length-i-1];
            i++;
        }
        return nLargests;
    }
}
