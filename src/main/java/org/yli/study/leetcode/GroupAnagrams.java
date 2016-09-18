package org.yli.study.leetcode;

import java.util.*;

/**
 * Created by yli on 9/17/2016.
 */
public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> groups = new ArrayList<>();

    Map<Integer, List<String>> maps = new LinkedHashMap<>();

    for (String aStr : strs) {
      int hashCode = getHashCode(aStr);

      if (!maps.containsKey(hashCode)) {
        maps.put(hashCode, new ArrayList<>());
      }

      maps.get(hashCode).add(aStr);
    }

    for (Map.Entry<Integer, List<String>> entry : maps.entrySet()) {
      groups.add(entry.getValue());
    }

    return groups;
  }

  private int getHashCode(String aStr) {
    char[] chars = aStr.toCharArray();
    Arrays.sort(chars);
    return new String(chars).hashCode();
  }
}
