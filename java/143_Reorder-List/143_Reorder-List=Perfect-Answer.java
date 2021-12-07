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
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head, head);
        ListNode rev = reverse(null, mid.next);
        mid.next = null;
        merge(head, rev);
    }
    
    private ListNode findMid(ListNode n1, ListNode n2) {
        if (n2.next == null || n2.next.next == null) return n1;
        n1 = n1.next;
        n2 = n2.next.next;
        return findMid(n1, n2);
    }
    
    private ListNode reverse(ListNode prev, ListNode curr) {
        if (curr == null) return prev;
        ListNode temp = curr.next;
        curr.next = prev;
        return reverse(curr, temp);
    }
    
    private void merge(ListNode h1, ListNode h2) {
        while (h2 != null) {
            ListNode next = h1.next;
            h1.next = h2;
            h1 = h2;
            h2 = next;
        }
    }
}