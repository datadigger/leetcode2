package org.yli.study.leetcode;

import java.util.*;

/**
 * Created by jason on 8/29/2016.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            int target = 0 - nums[i];

            int start = i + 1, end = len - 1;

            while (start < end) {
                int tmpSum = nums[start] + nums[end];

                if (target == tmpSum) {
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[start]);
                    tmpList.add(nums[end]);

                    res.add(tmpList);

                    while (start + 1 < len && nums[start + 1] == nums[start]) {
                        ++start;
                    }

                    ++start;

                    while (end - 1 >= 0 && nums[end - 1] == nums[end]) {
                        --end;
                    }

                    --end;

                } else if (tmpSum < target) {
                    ++start;
                } else {
                    --end;
                }
            }

            while (i + 1 < len && nums[i + 1] == nums[i]) {
                ++i;
            }
        }

        return res;
    }
}
