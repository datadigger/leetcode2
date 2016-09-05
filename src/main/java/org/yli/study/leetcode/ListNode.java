package org.yli.study.leetcode;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    /**
     * Create a list of nodes based on inputs.
     */
    static ListNode create(int... inputs) {
        if (inputs == null || inputs.length == 0) {
            return null;
        }
        ListNode head = new ListNode(inputs[0]);
        ListNode p = head;
        for (int i = 1; i < inputs.length; ++i) {
            ListNode q = new ListNode(inputs[i]);
            p.next = q;
            p = q;        
        }
        return head;
    }

    static boolean equals(ListNode p1, ListNode p2) {
        if (p1 == p2) {
            return true;
        } 

        if (p1 == null || p2 == null) {
            return false;
        } 

        while (p1 != null && p2 != null && p1.val == p2.val) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1 == p2; 
        
    }

    static void print(ListNode p) {
        while (p != null) {
            System.out.print(p.val);
            System.out.print(" ");
            p = p.next;
        }
        System.out.println();
    }
}