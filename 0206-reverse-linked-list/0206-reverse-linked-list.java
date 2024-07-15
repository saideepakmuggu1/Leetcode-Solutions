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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode last=null;
        ListNode front;
        while(curr!=null)
        {
            front=curr.next;
            curr.next=last;;
            last=curr;
            curr=front;
        }
        return last;
    }
}