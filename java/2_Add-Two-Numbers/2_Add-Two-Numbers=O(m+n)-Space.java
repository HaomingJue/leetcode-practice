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
        ListNode first = l1;
        ListNode second = l2;
        ListNode sentinel = new ListNode();
        boolean carry = false;
        ListNode preHead = sentinel;
        while(first != null && second != null) {
            ListNode node = new ListNode();
            sentinel.next = node;
            sentinel = node;
            if(carry) {
                node.val = first.val + second.val + 1;
                carry = false;
                if(node.val >= 10) {
                    node.val -= 10;
                    carry = true;
                }
            } else {
                node.val = first.val + second.val;
                if( node.val >= 10) {
                    node.val -= 10;
                    carry = true;
                }
            }
            first = first.next;
            second = second.next;
            
        }
        
        while(first != null) {
            ListNode node = new ListNode();
            if(carry) {
                node.val = first.val + 1;
                carry = false;
                if(node.val >= 10) {
                    carry = true;
                    node.val -= 10;
                }
            }else {
                node.val = first.val;
            }
            first = first.next;
            sentinel.next = node;
            sentinel = node;
        }
        
        while( second != null) {
            ListNode node = new ListNode();
            if(carry) {
                node.val = second.val + 1;
                carry = false;
                if(node.val >= 10) {
                    carry = true;
                    node.val -= 10;
                }
            }else {
                node.val = second.val;
            }
            second = second.next;
            sentinel.next = node;
            sentinel = node;
        }
        
        if(carry) {
            ListNode node = new ListNode();
            sentinel.next = node;
            node.val = 1;
        }
        return preHead.next;
    } 
}