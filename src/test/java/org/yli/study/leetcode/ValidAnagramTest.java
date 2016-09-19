package org.yli.study.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by yli on 9/17/2016.
 */
public class ValidAnagramTest {

  private ValidAnagram util = new ValidAnagram();

  @Test
  public void testSimple() {
    assertTrue(util.isAnagram("ate", "eat"));
    assertFalse(util.isAnagram("ate", "eatb"));
    assertFalse(util.isAnagram("ate", "abc"));
  }

}
