package org.yli.study.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yli on 9/17/2016.
 */
public class ZigZagConversion {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    int len = s.length();

    List<List<Character>> rows = new ArrayList<>();
    for (int i = 0; i < numRows; ++i) {
      rows.add(new ArrayList<>());
    }

    int rowIndex = 0;
    int direction = 1;
    for (char c : s.toCharArray()) {
      rows.get(rowIndex).add(c);

      rowIndex = rowIndex + direction;

      if (rowIndex == numRows - 1 || rowIndex == 0) {
        direction *= -1;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (List<Character> charList : rows) {
      for (Character aChar : charList) {
        sb.append(aChar);
      }
    }

    return sb.toString();
  }
}
