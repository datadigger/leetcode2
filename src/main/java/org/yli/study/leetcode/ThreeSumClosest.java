package org.yli.study.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = Integer.MAX_VALUE;
        int closestDifference = Integer.MAX_VALUE;

        int len = nums.length;

        for (int i = 0; i < len - 1; ++i) {
            int start = i + 1, end = len - 1;
             
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                int difference = Math.abs(sum - target);

                if (difference == 0) {
                    return sum;
                }

                if (closestDifference > difference) {
                    closestDifference = difference;
                    closestSum = sum;
                }

                if (sum < target) {
                    ++start;
                } else {
                    --end;
                }
            } 
        }

        return closestSum;
    }
}