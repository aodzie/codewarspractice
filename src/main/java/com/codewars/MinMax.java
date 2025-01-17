package com.codewars;

import java.util.List;
import java.util.Collections;

/*
Implement a function that returns the minimal and the maximal value of a list (in this order).
 */

class MinMax {
    static int[] getMinMax(List<Integer> list) {
        int[]minmax = new int[2];
        Collections.sort(list);
        minmax[0] = list.get(0);
        minmax[1] = list.get(list.size()-1);

        return minmax;
    }
}