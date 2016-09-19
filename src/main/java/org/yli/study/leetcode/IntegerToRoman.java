package org.yli.study.leetcode;

/**
 * Created by yli on 9/18/2016.
 */
public class IntegerToRoman {

  private static final String[][] all = new String[][] {
      {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",},
      {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",},
      {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",},
      {"", "M", "MM", "MMM"}};

  public String intToRoman(int num) {
    if (num == 0) {
      return "";
    }

    StringBuilder sb = new StringBuilder();

    int mod = 0;
    int index = 0;
    while (num > 0) {
      mod = num % 10;

      sb.insert(0, all[index][mod]);

      num /= 10;
      ++index;
    }

    return sb.toString();
  }
}
