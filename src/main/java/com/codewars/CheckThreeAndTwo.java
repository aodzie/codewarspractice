package com.codewars;

/*
Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran, Chars in Haskell), check if the array contains three and two of the same values.

Examples
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"
 */

public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        int a=0;
        int b=0;
        int c=0;
        for (int i=0; i<chars.length; i++){
            if (chars[i]=='a') a++;
            if (chars[i]=='b') b++;
            if (chars[i]=='c') c++;
        }
        if (a>3 || a==1 || b>3 || b==1 || c>3 || c==1) return false;
        else return true;
    }
}
