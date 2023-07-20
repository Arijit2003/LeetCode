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
        ListNode headDuplicate=head;
        //counting no of elements
        int count=1;
        while(headDuplicate.next!=null){
            count++;
            headDuplicate=headDuplicate.next;
        }
        int removeIndex=count-n;
        ListNode removeNode=head;
        ListNode previousNode=head;
        for(int i=1;i<=removeIndex;i++){
            previousNode=removeNode;
            removeNode=removeNode.next;
        }
        if(removeIndex==0){
            head=head.next;
            return head;
        }
        previousNode.next=removeNode.next;
        return head;
        
    }
}