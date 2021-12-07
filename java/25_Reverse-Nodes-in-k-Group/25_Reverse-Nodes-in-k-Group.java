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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(0, head);
        ListNode cur = newHead;
        while (true) {
            if (!reachEnd(cur, k)) return newHead.next;
            cur = reverseKNodes(cur, k);
        }
    }
    
    private boolean reachEnd(ListNode cur, int k) {
        ListNode senator = cur;
        if (senator == null) return false;
        for (int i = 0; i < k; i++) {
            senator = senator.next;
            if (senator == null) return false;
        }
        return true;
    }
    
    private ListNode reverseKNodes(ListNode lastNode, int k) {
        ListNode tempHead = lastNode.next;
        ListNode cur = lastNode.next;
        for (int i = 0; i < k - 1; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = tempHead;
            tempHead = temp;
        }
        lastNode.next = tempHead;
        return cur;
    }
}