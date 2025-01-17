package com.codewars;

/*
Here you will create the classic Pascal's triangle.
Your function will be passed the depth of the triangle and your code has to return the corresponding Pascal's triangle up to that depth.

The triangle should be returned as a nested array. For example:

pascal(5) -> [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
 */

public class PascalsTriangle {
    public static int[][] pascal(int depth) {
        int [][]triangle = new int [depth][];
        for (int i=0; i<triangle.length; i++){
            triangle[i] = new int[i+1];
            triangle[i][0] = triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        return triangle;
    }
}
