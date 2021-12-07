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
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode node = head;
        int i = 0;
        while (node != null) {
            map.put(i++, node);
            node = node.next;
        }
        ListNode preHead = new ListNode();
        ListNode cur = preHead;
        for (int j = 0 ;j < (i + 1)/2; j++) {
            ListNode temp = map.get(j);
            cur.next = temp;
            cur = temp;
            temp = map.get(i - j - 1);
            cur.next = temp;
            cur = temp;
        }
        cur.next = null;
        if (i % 2 == 0) {
            cur.next = map.get(i/2);
            cur.next = null;
        }
        preHead.next = null;
    }
}