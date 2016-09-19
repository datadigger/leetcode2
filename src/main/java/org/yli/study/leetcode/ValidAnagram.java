package org.yli.study.leetcode;

import java.util.Arrays;

/**
 * Created by yli on 9/17/2016.
 */
public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] counts = new int[26];
    for (int i = 0; i < counts.length; ++i) {
      counts[i] = 0;
    }

    for (char aChar : s.toCharArray()) {
      ++counts[aChar - 'a'];
    }

    for (char aChar : t.toCharArray()) {
      if (--counts[aChar - 'a'] < 0) {
        return false;
      }
    }

    return true;
  }

}
