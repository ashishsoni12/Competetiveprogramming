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
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            current=current.next;
            count+=1;
        }
       count=count/2;
        current=head;
        for(int i=1;i<=count;i++)
        {
            current=current.next;
            if(i==count)
            {
                System.out.println(current.val);
            }
        }
        return current;
        
    }
}