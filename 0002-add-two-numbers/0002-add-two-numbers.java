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
        ListNode t1=l1;
        ListNode t2=l2;
        int c=0;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(t1!=null || t2!=null)
        {
            int s=c;
            if(t1!=null) s=s+t1.val;
            if(t2!=null) s=s+t2.val;
            ListNode newnode=new ListNode(s%10);
            c=s/10;
            curr.next=newnode;
            curr=curr.next;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
            
        }
        if(c>0)
        {
            ListNode newnode=new ListNode(c);
            curr.next=newnode;
        }
        return dummy.next;
    }
}