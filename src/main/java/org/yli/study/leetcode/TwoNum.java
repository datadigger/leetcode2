package org.yli.study.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason on 8/29/2016.
 */
public class TwoNum {
    public int[] twoSum(int[] nums, int target) {
        int index1 = -1, index2 = -1;

        int targetb;

        loop:
        for (int i = 0; i < nums.length; ++i) {
            targetb = target - nums[i];
            index1 = i;

            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] == targetb) {
                    index2 = j;
                    break loop;
                }
            }
        }

        return new int[] {index1, index2};
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            if (aMap.containsKey(target - nums[i])) {
                return new int[] {aMap.get(target - nums[i]), i};
            } else {
                aMap.put(nums[i], i);
            }
        }

        return new int[] {};
    }

    public int[] twoSum3(int[] nums, int target) {
        int[] backupNums = new int[nums.length];

        System.arraycopy(nums, 0, backupNums, 0, nums.length);

        Arrays.sort(backupNums);

        int low = 0, high = nums.length - 1;

        int tmpSum = backupNums[low] + backupNums[high];
        while (target != tmpSum) {
            if (target < tmpSum) {
                --high;
            } else {
                ++low;
            }

            tmpSum = backupNums[low] + backupNums[high];
        }

        int oi1 = -1, oi2 = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == backupNums[low] && oi1 == -1) {
                oi1 = i;
            } else if (nums[i] == backupNums[high] && oi2 == -1) {
                oi2 = i;
            }
        }

        int[] res = new int[] { oi1, oi2 };
        Arrays.sort(res);

        return res;
    }
}
