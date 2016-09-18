package org.yli.study.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 9/17/2016.
 */
public class ZigZagConversionTest {

  private ZigZagConversion util = new ZigZagConversion();

  @Test
  public void testSimple() {
    assertEquals("PAHNAPLSIIGYIR", util.convert("PAYPALISHIRING", 3));
    assertEquals("PAYPALISHIRING", util.convert("PAYPALISHIRING", 1));
    assertEquals("ABC", util.convert("ABC", 3));
  }

}
