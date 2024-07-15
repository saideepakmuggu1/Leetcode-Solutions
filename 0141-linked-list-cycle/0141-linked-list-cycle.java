/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> hm=new HashMap<>();
            ListNode temp=head;
        while(temp!=null)
        {
            if(hm.containsKey(temp))
                return true;
            else
            {
              hm.put(temp,hm.getOrDefault(temp,0)+1);
                temp=temp.next;
            }
        }
        return false;
    }
}