package com.codewars;

public class Factorial {
    public static long factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return factorial(n-1)*n;
        }
    }
}