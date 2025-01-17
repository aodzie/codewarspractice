package com.codewars;

/*
Complete the function to find the count of the most frequent item of an array. You can assume that input is an array of integers. For an empty array return 0

Example
input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5
The most frequent number in the array is -1 and it occurs 5 times.
 */

public class MostFrequentItemCount {
    public static int mostFrequentItemCount(int[] collection) {
        int frequent = 0;
        if (collection.length > 0){
            for (int i=0; i<collection.length; i++){
                int count = 1;
                for (int j=0; j<collection.length; j++){
                    if (i!=j && collection[i]==collection[j]) count++;
                }
                if (count>frequent) frequent = count;
            }
        }
        return frequent;
    }
}
