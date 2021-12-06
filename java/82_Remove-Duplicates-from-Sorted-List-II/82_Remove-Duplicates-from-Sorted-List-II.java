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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(Integer.MIN_VALUE, head);
        ListNode cur = preHead;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val != cur.next.next.val) {
                cur = cur.next;
                continue;
            } else {
                ListNode temp = cur.next;
                while (temp != null && temp.val == cur.next.val) {
                    temp = temp.next;
                }
                cur.next = temp;
            }
        }
        return preHead.next;
    }
}