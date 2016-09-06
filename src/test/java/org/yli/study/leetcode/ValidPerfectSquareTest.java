package org.yli.study.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jason on 9/5/2016.
 */
public class ValidPerfectSquareTest {

    ValidPerfectSquare util = new ValidPerfectSquare();

    @Test
    public void testSimple() {
        assertTrue(util.isPerfectSquare(1));
        assertFalse(util.isPerfectSquare(2));
        assertFalse(util.isPerfectSquare(3));
        assertTrue(util.isPerfectSquare(4));
        assertFalse(util.isPerfectSquare(5));
        assertTrue(util.isPerfectSquare(16));
        assertFalse(util.isPerfectSquare(14));
        assertTrue(util.isPerfectSquare(100));
        assertTrue(util.isPerfectSquare(121));
        assertTrue(util.isPerfectSquare(144));
        assertTrue(util.isPerfectSquare(400));
        assertTrue(util.isPerfectSquare(900));
        assertTrue(util.isPerfectSquare(25));
        assertTrue(util.isPerfectSquare(36));
        assertTrue(util.isPerfectSquare(49));
        assertFalse(util.isPerfectSquare(24));
        assertFalse(util.isPerfectSquare(26));

        assertTrue(util.isPerfectSquare(808201));
    }

}
