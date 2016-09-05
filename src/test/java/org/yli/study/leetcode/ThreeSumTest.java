package org.yli.study.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jason on 8/29/2016.
 */
public class ThreeSumTest {

    private ThreeSum util = new ThreeSum();

    @Test
    public void testSimple() {
        List<List<Integer>> res = util.threeSum(new int[] {-1,0,1,2,-1,-4});
        assertEquals(2, res.size());

        res = util.threeSum(new int[] {-2, -2, -2, 0, 2});
        assertEquals(1, res.size());

        res = util.threeSum(new int[] {1, 0, 0, 0, -1});
        assertEquals(2, res.size());

        res = util.threeSum(new int[] {0, 0, 0, 0, 0, 0, 0});
        assertEquals(1, res.size());

        res = util.threeSum(new int[] {-2, 0, 1, 1, 2});
        assertEquals(2, res.size());
    }

}
