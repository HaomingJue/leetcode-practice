/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        boolean flagA = false;
        boolean flagB = false;
        while (true) {
            if (curA == curB) return curA;
            if (curA != null && curB != null) {
                curA = curA.next;
                curB = curB.next;
                continue;
            }
            if (curA == null) {
                if (flagA) return null;
                curA = headB;
                flagA = true;
            }
            if (curB == null) {
                if (flagB) return null;
                curB = headA;
                flagB = true;
            }
        }
    }
}