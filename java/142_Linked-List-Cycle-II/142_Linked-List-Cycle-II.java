/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode former = head;
        ListNode latter = head;
        while(true) {
            if (former == null || former.next == null) return null;
            former = former.next.next;
            latter = latter.next;
            if (former == latter) break;
        } 
        ListNode seeker = head;
        while (latter != seeker) {
            seeker = seeker.next;
            latter = latter.next;
        }
        return seeker;
    }
}