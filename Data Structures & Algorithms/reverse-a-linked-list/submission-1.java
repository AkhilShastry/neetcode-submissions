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

    ListNode curr;
    ListNode prev = null;

    public ListNode reverseList(ListNode head) {
        curr = head;
        while(curr != null){
            head = head.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        return prev;
    }
}
