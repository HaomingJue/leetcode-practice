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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode preCur1 = new ListNode(0, l1);
        ListNode cur2 = l2;
        int carry = 0;
        while (preCur1.next != null && cur2 !=null) {
            preCur1.next.val = preCur1.next.val + cur2.val + carry;
            carry = 0;
            if (preCur1.next.val >= 10) {
                preCur1.next.val -= 10;
                carry = 1;
            }
            preCur1 = preCur1.next;
            cur2 = cur2.next;
        }
        if (cur2 != null) {
            preCur1.next = cur2;
            while(preCur1.next != null) {
                preCur1.next.val += carry;
                carry = 0;
                if (preCur1.next.val >= 10) {
                    preCur1.next.val -= 10;
                    carry = 1;
                }
                preCur1 = preCur1.next;
            }
            if (carry == 1) {
                preCur1.next = new ListNode(1);
            }
            return l1;
        } else {
            while (preCur1.next != null) {
                preCur1.next.val += carry;
                carry = 0;
                if (preCur1.next.val >= 10) {
                    preCur1.next.val -= 10;
                    carry = 1;
                }
                preCur1 = preCur1.next;
            }
            if (carry == 1) {
                preCur1.next = new ListNode(1);
            }
            return l1;
        }
    }
}