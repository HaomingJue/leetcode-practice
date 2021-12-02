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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode last = head;
        int size = 1;
        while (last.next != null) {
            last = last.next;
            size++;
        }
        ListNode odd = head;
        ListNode even = head.next;
        for (int i = 0; i < size / 2; i++) {
            odd.next = even.next;
            odd = odd.next;
            last.next = even;
            even.next = null;
            last = even;
            even = odd.next;
        }
        return head;
    }
}