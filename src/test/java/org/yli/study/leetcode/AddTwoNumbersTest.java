package org.yli.study.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    AddTwoNumbers util = new AddTwoNumbers();

    @Test
    public void testSimple() {
        assertTrue(ListNode.equals(ListNode.create(7, 0, 8), 
            util.addTwoNumbers(ListNode.create(2, 4, 3), ListNode.create(5, 6, 4))));
        assertTrue(ListNode.equals(ListNode.create(7, 0, 8), 
            util.addTwoNumbers(null, ListNode.create(7, 0, 8))));
        assertTrue(ListNode.equals(ListNode.create(2, 4, 3), 
            util.addTwoNumbers(ListNode.create(2, 4, 3), null)));
        ListNode.print(util.addTwoNumbers(ListNode.create(1), ListNode.create(9, 9, 9, 9)));
        assertTrue(ListNode.equals(ListNode.create(0, 0, 0, 0, 1), 
            util.addTwoNumbers(ListNode.create(1), ListNode.create(9, 9, 9, 9))));
        assertTrue(ListNode.equals(ListNode.create(2), 
            util.addTwoNumbers(ListNode.create(1), ListNode.create(1))));
    }
}