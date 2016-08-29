package org.yli.study.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jason on 8/29/2016.
 */
public class TwoNumTest {

    private TwoNum util = new TwoNum();

    @Test
    public void testSimple() {
        assertArrayEquals(new int[] {0, 1}, util.twoSum(new int[] {1, 2, 4, 5}, 3));
        assertArrayEquals(new int[] {2, 3}, util.twoSum(new int[] {1, 2, 4, 5}, 9));
        assertArrayEquals(new int[] {0, 3}, util.twoSum(new int[] {0, 2, 4, 0}, 0));
        assertArrayEquals(new int[] {2, 4}, util.twoSum(new int[] {-1, -2, -3, -4, -5}, -8));
    }

    @Test
    public void testSimple2() {
        assertArrayEquals(new int[] {0, 1}, util.twoSum2(new int[] {1, 2, 4, 5}, 3));
        assertArrayEquals(new int[] {2, 3}, util.twoSum2(new int[] {1, 2, 4, 5}, 9));
        assertArrayEquals(new int[] {0, 3}, util.twoSum2(new int[] {0, 2, 4, 0}, 0));
        assertArrayEquals(new int[] {2, 4}, util.twoSum2(new int[] {-1, -2, -3, -4, -5}, -8));
    }

    @Test
    public void testSimple3() {
        assertArrayEquals(new int[] {0, 1}, util.twoSum3(new int[] {1, 2, 4, 5}, 3));
        assertArrayEquals(new int[] {2, 3}, util.twoSum3(new int[] {1, 2, 4, 5}, 9));
        assertArrayEquals(new int[] {0, 3}, util.twoSum3(new int[] {0, 2, 4, 0}, 0));
        assertArrayEquals(new int[] {2, 4}, util.twoSum3(new int[] {-1, -2, -3, -4, -5}, -8));
    }
}
