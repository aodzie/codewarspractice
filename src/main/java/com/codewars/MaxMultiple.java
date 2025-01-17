package com.codewars;

/*
Task
Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
N is divisible by divisor
N is less than or equal to bound
N is greater than 0.

Notes
The parameters (divisor, bound) passed to the function are only positive values .
It's guaranteed that a divisor is Found .
 */

public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        int max=bound;
        while (max%divisor!=0){
            max--;
        }
        return max;
    }
}