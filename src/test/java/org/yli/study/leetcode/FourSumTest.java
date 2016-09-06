package org.yli.study.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by jason on 9/5/2016.
 */
public class FourSumTest {

    FourSum util = new FourSum();

    @Test
    public void testSimple() {
        List<List<Integer>> results = util.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
        assertEquals(3, results.size());

        assertArrayEquals(new Integer[] { -1, 0, 0, 1}, results.get(2).stream().toArray(Integer[]::new));
        assertArrayEquals(new Integer[] { -2, -1, 1, 2}, results.get(0).stream().toArray(Integer[]::new));
        assertArrayEquals(new Integer[] { -2, 0, 0, 2}, results.get(1).stream().toArray(Integer[]::new));

        results = util.fourSum(new int[] {0, 0, 0, 0, 0, 0, 0}, 0);
        assertEquals(1, results.size());
        assertArrayEquals(new Integer[] { 0, 0, 0, 0}, results.get(0).stream().toArray(Integer[]::new));

        results = util.fourSum(new int[] {0, 0, 0, 0, 0, 0, 0}, 1);
        assertEquals(0, results.size());

        results = util.fourSum(new int[] {1, 1, 1, 1, 1, 1, 1, 1}, 4);
        assertEquals(1, results.size());

        results = util.fourSum(new int[] {1, 1, 2, 2, 3, 3, 4, 4}, 10);
        assertEquals(3, results.size());

        results = util.fourSum(new int[] {1,0,-1,0,-2,2}, 0);

    }

}
