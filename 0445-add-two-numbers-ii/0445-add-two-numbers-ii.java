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
        l1=reverse(l1); l2=reverse(l2);
        ListNode res=null,temp=null;
        int carry=0, add=0;
        while(l1!=null && l2!=null){
            add=carry+l1.val+l2.val;
            carry=add/10;
            add=add%10;
            if(res==null){
                res=new ListNode(add);
                temp=res;
            }else{
                res.next=new ListNode(add);
                res=res.next;
            }
            l1=l1.next; l2=l2.next; 
        }
        while(l1!=null){
            add=carry+l1.val;
            carry=add/10;
            add=add%10;
            res.next=new ListNode(add);
            res=res.next;
            l1=l1.next;
        }
        while(l2!=null){
            add=carry+l2.val;
            carry=add/10;
            add=add%10;
            res.next=new ListNode(add);
            res=res.next;
            l2=l2.next;
        }
        if(carry>0)res.next=new ListNode(carry);
        res=reverse(temp);
        return res;
    }
    public ListNode reverse(ListNode l){
        ListNode prev=null, next=l.next;
        while(next!=null){
            l.next=prev;
            prev=l;
            l=next;
            next=next.next;
        }
        l.next=prev;
        return l;
    }
    public void print(ListNode l){
        while(l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }
    }
}