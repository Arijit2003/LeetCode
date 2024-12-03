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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)return head;
        int n=length(head);
        if(n==1 || n==k)return head;
        if(k>n)k=k%n;
        if(k==0)return head;
        int pos=n-k,i=1;
        ListNode temp=head,next=null;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        next=temp.next;
        temp.next=null;
        temp=next;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head=next;
        return head;

    }
    

    public int length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}