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
    ListNode second;
    ListNode first;
    ListNode dummy = new ListNode(0);
    public ListNode removeNthFromEnd(ListNode head, int n) {
        dummy.next = head;
        head = dummy;
        second = dummy;
        first = dummy.next;
        while(n > 0){
            first = first.next;
            n--;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
