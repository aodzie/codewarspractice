package com.codewars;

/*
You have to write a function pattern which returns the following Pattern (See Pattern & Examples) upto n number of rows.

Note: Returning the pattern is not the same as Printing the pattern.
Rules/Note:
If n < 1 then it should return "" i.e. empty string.
There are no whitespaces in the pattern.
Pattern:
(n)(n-1)(n-2)...4321
(n)(n-1)(n-2)...432
(n)(n-1)(n-2)...43
(n)(n-1)(n-2)...4
...............
..............
(n)(n-1)(n-2)
(n)(n-1)
(n)

Examples:
pattern(4):

4321
432
43
4
 */

public class CompleteThePattern {
    public static String pattern ( int n) {
        String output = "";
        int min = 0;
        for (int i=0; i<n; i++){
            for (int j=n; j>0; j--){
                if (j>min){
                    output += j;
                }
            }
            min++;
            if (i!=min && i!=n-1){
                output += "\n";
            }
        }
        return output;
    }
}
