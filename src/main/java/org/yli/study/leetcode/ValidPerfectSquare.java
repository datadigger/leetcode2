package org.yli.study.leetcode;

/**
 * Created by jason on 9/5/2016.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        long start = 0, end = num;

        while (start <= end) {
            long mid = (start + end) / 2;

            long squre = mid * mid;

            if (squre == num) {
                return true;
            } else if (squre < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
