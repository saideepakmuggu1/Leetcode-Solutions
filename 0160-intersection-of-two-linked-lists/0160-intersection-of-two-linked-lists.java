/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> hm=new HashMap<>();
        ListNode temp=headA;
        while(temp!=null)
        {
               hm.put(temp,hm.getOrDefault(temp,0)+1);
               temp=temp.next;
        }
        temp=headB;
         while(temp!=null)
        {
               if(hm.containsKey(temp))
               {
                   return temp;
               }
             else 
             {
                hm.put(temp,hm.getOrDefault(temp,0)+1);
               temp=temp.next; 
             }
        }
        return null;
    }
}