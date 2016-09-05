package org.yli.study.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void testSimple() {
        ListNode root = new ListNode(2);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        root.next = n1;
        n1.next = n2;

        assertTrue(ListNode.equals(root, ListNode.create(2, 1, 3)));
        assertFalse(ListNode.equals(root, ListNode.create(1, 2, 3)));        
    }

}