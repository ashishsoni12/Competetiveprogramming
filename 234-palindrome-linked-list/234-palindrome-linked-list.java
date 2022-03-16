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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode current=slow;
        while(current!=null)
        {
            ListNode temp=current.next;
            current.next=prev;
             prev=current;
            current=temp;
           
        }
        
        slow=head;
        while(prev!=null)
        {
            if(slow.val!=prev.val)
            {
                return false;
            }
            slow=slow.next;
            prev=prev.next;
        }
        
        return true;
    }
}