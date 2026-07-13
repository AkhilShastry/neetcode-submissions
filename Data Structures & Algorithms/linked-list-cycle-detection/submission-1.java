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
    int currIndex = 0;
    public boolean hasCycle(ListNode head) {
        curr = head;
        while(curr != null){
            if(curr.val <= currIndex){
                return true;
            }
            curr.val = currIndex;
            currIndex += 1;
            curr = curr.next;
        }
        return false;
    }
}
