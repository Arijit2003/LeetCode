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
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        ListNode slow=head,fast=head;
        while(slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast!=null)fast=fast.next;
            if(fast!=null && fast==slow)break;
        }
        
        if(slow==null || fast==null)return null;
        slow=head;
        int pos=0;
        
        while(slow!=fast){
            pos++;
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(pos);
        return  slow;
    }
}