package org.yli.study.leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int additional = 0;

        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode newRoot = null;

        ListNode p = null;

        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val + additional;
            additional = sum / 10;

            if (newRoot == null) {
                newRoot = new ListNode(sum % 10);
                p = newRoot;
            } else {
                ListNode q = new ListNode(sum % 10);
                p.next = q;
                p = q;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        ListNode r = p1 != null ? p1 : p2;

        while (r != null) {
            int sum = r.val + additional;
            additional = sum / 10;

            if (newRoot == null) {
                newRoot = new ListNode(sum % 10);
                p = newRoot;
            } else {
                ListNode q = new ListNode(sum % 10);
                p.next = q;
                p = q;
            }

            r = r.next;
        }

        if (additional != 0) {
            ListNode q = new ListNode(additional);
            p.next = q;
        }

        return newRoot;
    }
}