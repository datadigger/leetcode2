package org.yli.study.leetcode;

import org.junit.Test;

import java.security.acl.Group;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 9/17/2016.
 */
public class GroupAnagramsTest {

  private GroupAnagrams util = new GroupAnagrams();

  @Test
  public void testSimple() {
    List<List<String>> lists = util.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});

    assertEquals(3, lists.size());

    List<String> list1 = lists.get(0);
    assertEquals(3, list1.size());
    assertEquals("eat", list1.get(0));
    assertEquals("tea", list1.get(1));
    assertEquals("ate", list1.get(2));

    List<String> list2 = lists.get(1);
    assertEquals(2, list2.size());
    assertEquals("tan", list2.get(0));
    assertEquals("nat", list2.get(1));

    List<String> list3 = lists.get(2);
    assertEquals(1, list3.size());
    assertEquals("bat", list3.get(0));
  }

}
