package com.codewars;

//Create function fib that returns n'th element of Fibonacci sequence (classic programming task).

public class Fibonacci {
    public static long fib (int n){
        if((n == 1)|| (n==0)){
            return n;
        };
        return fib(n-1)+fib(n-2);
    };
}
