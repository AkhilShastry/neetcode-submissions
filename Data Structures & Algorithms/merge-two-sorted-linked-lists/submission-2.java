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
    ListNode curr1;
    ListNode curr2;
    ListNode head3 = null;
    ListNode prev = head3;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        curr1 = list1;
        curr2 = list2;
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                if(prev == null){
                    head3 = curr1;
                    prev = head3;
                }
                else{
                    prev.next = curr1;
                    prev = prev.next;
                }
                curr1 = curr1.next;
            }
            else{
                ListNode newNode = new ListNode(curr2.val);
                if(prev == null){
                    head3 = curr2;
                    prev = head3;
                }
                else{
                    prev.next = curr2;
                    prev = prev.next;
                }
                curr2 = curr2.next;
            }
        }
        if(curr1 == null && curr2 != null){
            if(prev == null){
                head3 = curr2;
            }
            else{
                prev.next = curr2;
            }
        }
        else if(curr2 == null && curr1 != null){
            if(prev == null){
                head3 = curr1;
            }
            else{
                prev.next = curr1;
            }
        }
        return head3;
    }
}