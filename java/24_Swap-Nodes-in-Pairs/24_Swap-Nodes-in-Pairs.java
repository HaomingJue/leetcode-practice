/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        ListNode pre = new ListNode(0, head);
        ListNode odd = head;
        ListNode even;
        while (odd != null && odd.next != null) {
            even = odd.next;
            pre.next = even;
            odd.next = even.next;
            even.next = odd;
            odd = odd.next;
            pre = pre.next.next;
        }
        return newHead;
    }
}