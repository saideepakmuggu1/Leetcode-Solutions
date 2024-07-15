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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null)
        {
            temp=temp.next;
            cnt++;
        }
        if(n==cnt)
            return head.next;
        cnt=cnt-n;
        temp=head;
        for(int i=1;i<cnt;i++)
            temp=temp.next;
        if(temp!=null && temp.next!=null)
            temp.next=temp.next.next;
        return head;
    }
}