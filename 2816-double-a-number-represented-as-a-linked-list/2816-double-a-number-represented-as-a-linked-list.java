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
    public ListNode doubleIt(ListNode head) {
        if(head==null)
        {
            ListNode newnode=new ListNode(0);
            return newnode;
        }
        ListNode temp=head;
        int carry=helper(temp);
        if(carry>0)
        {
            ListNode newnode=new ListNode(carry);
            newnode.next=head;
            return newnode;
        }
        return head;
    }
    private static int helper(ListNode temp)
    {
        if(temp==null)
            return 0;
        int carry=helper(temp.next);
    
        int mul=temp.val *2 + carry;
        temp.val=mul%10;
        return mul/10;
    }
}