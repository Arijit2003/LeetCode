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
class Pair{
    ListNode start,end;
    Pair(ListNode start,ListNode end){
        this.start=start;
        this.end=end;
    }
}
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null,start=null,end=null,next=null,temp=head;
        int count=1;
        while(temp!=null){
            if(count==left) {
                start=temp;
            }
            else if(count==right){
                end=temp;
                next=temp.next;
                break;
            }
            if(start==null) prev=temp;
            temp=temp.next; 
            count++;
        }
        if(start==null || end == null)return head;
        end.next=null;
        
        
        Pair p = reverse(start,end);
        System.out.println(p.end.val);
        if(prev!=null)prev.next=p.start; p.end.next=next;
        return (prev!=null)?head:p.start;

    }
    public Pair reverse(ListNode start, ListNode end){
        ListNode prev=null,curr=start,next=start.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)next=next.next;
        }
        // print(end,start);
        return new Pair(prev,start);

    }
    public void print(ListNode start,ListNode end){
        while(start!=null){
            System.out.println(start.val);
            start=start.next;
        }
    }

}