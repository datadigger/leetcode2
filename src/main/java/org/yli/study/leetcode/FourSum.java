package org.yli.study.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jason on 9/5/2016.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        int len = nums.length;

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < len - 3; ++i) {
            for (int j = i + 1; j < len - 2; ++j) {
                int start = j + 1, end = len - 1;

                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {
                        List<Integer> aResult = new ArrayList<>();
                        aResult.add(nums[i]);
                        aResult.add(nums[j]);
                        aResult.add(nums[start]);
                        aResult.add(nums[end]);

                        results.add(aResult);

                        while (start < end && nums[start + 1] == nums[start]) {
                            ++start;
                        }
                        ++start;

                        while (start < end && nums[end - 1] == nums[end]) {
                            --end;
                        }
                        --end;

                    } else if (sum < target) {
                        ++start;
                    } else {
                        --end;
                    }
                }

                while (j + 1 < len && nums[j + 1] == nums[j]) {
                    ++j;
                }
            }

            while (i + 1 < len && nums[i + 1] == nums[i]) {
                ++i;
            }
        }

        return results;
    }
}
