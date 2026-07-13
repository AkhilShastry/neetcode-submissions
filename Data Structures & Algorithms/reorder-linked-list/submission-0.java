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
    ListNode slow;
    ListNode fast;
    ListNode prev = null;
    ListNode second;
    ListNode first;

    public void reorderList(ListNode head) {
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        second = slow.next;
        slow.next = prev;
        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        first = head;
        second = prev;
        while(second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }



    }
}
