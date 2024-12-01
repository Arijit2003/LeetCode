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
        int len=len(head);
        int midpos=(len%2!=0)?(len+1)/2:(len/2)+1;
        int i=1;
        while(i<midpos){
            head=head.next;
            i++;
        }
        return head;
    }
    public int len(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}