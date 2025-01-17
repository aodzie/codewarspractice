package com.codewars;

import java.util.*;

public class FindTheMissingNumber {
    public static int missingNo(int[] nums) {
        Arrays.sort(nums);
        int missing = 100;
        for (int i=1; i<nums.length; i++){
            if (nums[i-1] != nums[i]-1) missing = nums[i]-1;
            else if (nums[0]==1) missing=0;
        }
        return missing;
    }
}
