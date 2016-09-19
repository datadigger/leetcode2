package org.yli.study.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 9/19/2016.
 */
public class IntegerToRomanTest {

  private IntegerToRoman util = new IntegerToRoman();

  @Test
  public void testSimple() {
    assertEquals("MDCCC", util.intToRoman(1800));
    assertEquals("MMMCMXCIX", util.intToRoman(3999));
  }

}
