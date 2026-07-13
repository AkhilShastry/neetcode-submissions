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
    ListNode one;
    ListNode two;
    ListNode dummy;
    ListNode currNode;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int newValue = 0;
        dummy = new ListNode(0);
        currNode = dummy;
        one = l1;
        two = l2;
        while(one != null && two != null){
            newValue = one.val + two.val;
            if(newValue+carry > 9){
                currNode.next = new ListNode((newValue+carry)%10); 
                if(carry > 0){
                    carry--;
                }
                currNode = currNode.next;
                carry += 1;
            }
            else{
                currNode.next = new ListNode(newValue+carry);
                carry = 0;
                currNode = currNode.next; 
            }
            one = one.next;
            two = two.next;
        }
        while(two != null){
            newValue = two.val;
            if(newValue+carry > 9){
                currNode.next = new ListNode((newValue+carry)%10); 
                currNode = currNode.next;
                if(carry > 0){
                    carry--;
                }
                carry += 1;
            }
            else{
                currNode.next = new ListNode(newValue+carry);
                carry = 0;
                currNode = currNode.next; 
            }
            two = two.next;
        }
        while(one != null){
            newValue = one.val;
            if(newValue+carry > 9){
                currNode.next = new ListNode((newValue+carry)%10); 
                currNode = currNode.next;
                if(carry > 0){
                    carry--;
                }
                carry += 1;
            }
            else{
                currNode.next = new ListNode(newValue+carry);
                carry = 0;
                currNode = currNode.next; 
            }
            one = one.next;
        }
        
        if(carry != 0){
            currNode.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
