package com.codewars;

/*
Write a function that takes a shuffled list of unique numbers from 1 to n with one element missing (which can be any number including n). Return this missing number.

Note: huge lists will be tested.

Examples:
[1, 3, 4]  =>  2
[1, 2, 3]  =>  4
[4, 2, 3]  =>  1
 */

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        int sumExpected = 0;
        int actualSum = 0;
        for (int i=1; i<=numbers.length+1; i++){
            sumExpected += i;
        }
        for (int j=0; j<numbers.length; j++){
            actualSum += numbers[j];
        }
        return sumExpected - actualSum;
    }
}
