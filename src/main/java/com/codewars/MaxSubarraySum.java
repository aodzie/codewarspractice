package com.codewars;

/*
The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */

public class MaxSubarraySum {
    public static int sequence(int[] arr) {
        int sum = 0;
        if (arr.length>0){
            for (int s=0; s<arr.length; s++){
                sum = sum + arr[s];
            }

            for (int i=0; i<arr.length; i++){
                int sum2 = 0;
                for (int j=i; j<arr.length; j++){
                    sum2 = sum2+arr[j];

                    if (sum2>sum) sum = sum2;
                }
            }
        }
        return sum>0 ? sum : 0;
    }
}
