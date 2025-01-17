package com.codewars;

/*
A number is called Automorphic number if and only if its square ends in the same digits as the number itself. For example, 25 is an automorphic number because its square (625) ends with 25.

Task
Given a positive number, determine if it is Automorphic or not. If it is, return "Automorphic", otherwise return "Not!!"

Examples
25 is an automorphic number, because
25^2 = 625 ends with 25, so return "Automorphic".

13 is not an automorphic number, because
13^2 = 169 does not end with 13, so return "Not!!".

76 is an automorphic number, because
76^2 = 5776 ends with 76, so return "Automorphic".


 */

public class AutomorphicNumber {
    public static String autoMorphic(int number)
    {
        int sqrt = number * number;
        boolean automorphic = true;
        while (number >0){
            if (sqrt%10 != number%10){
                automorphic = false;
            }
            number = number/10;
            sqrt = sqrt/10;
        }
        return automorphic == true ? "Automorphic" : "Not!!";
    }
}
