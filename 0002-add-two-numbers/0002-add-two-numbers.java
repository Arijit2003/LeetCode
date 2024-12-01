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
        ListNode res=null,temp=null;
        int carry=0,v;
        while(l1!=null && l2!=null){
            v=carry+l1.val+l2.val;
            carry=v/10;
            v=v%10;
            if(res==null){
                res=new ListNode(v);
                temp=res;
            }else{
                temp.next=new ListNode(v);
                temp=temp.next;
            }
            l1=l1.next; l2=l2.next;
        }
        while(l1!=null){
            v=carry+l1.val;
            carry=v/10;
            v=v%10;
            if(res==null){
                res=new ListNode(v);
                temp=res;
            }else{
                temp.next=new ListNode(v);
                temp=temp.next;
            }
            l1=l1.next;
        }
        while(l2!=null){
            v=carry+l2.val;
            carry=v/10;
            v=v%10;
            if(res==null){
                res=new ListNode(v);
                temp=res;
            }else{
                temp.next=new ListNode(v);
                temp=temp.next;
            }
            l2=l2.next;
        }
        if(carry!=0)temp.next=new ListNode(carry);
        return res;
    }
}