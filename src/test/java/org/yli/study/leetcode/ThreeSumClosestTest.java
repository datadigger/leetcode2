package org.yli.study.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    private ThreeSumClosest util = new ThreeSumClosest();

    @Test
    public void testSimple() {
        assertEquals(3, util.threeSumClosest(new int[] {1, 1, 1, 1}, 2));
        assertEquals(3, util.threeSumClosest(new int[] {1, 1, 1, 1}, 3));
        assertEquals(3, util.threeSumClosest(new int[] {1, 1, 1, 1}, 4));
        assertEquals(2, util.threeSumClosest(new int[] {1, 1, 0, 0}, 4));
        assertEquals(1, util.threeSumClosest(new int[] {1, -1, 0, 0}, 4));
    }

}