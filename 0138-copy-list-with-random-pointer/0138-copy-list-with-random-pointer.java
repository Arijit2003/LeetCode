/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hmap = new HashMap<>();
        hmap.put(null,null);
        Node temp=head;
        while(temp!=null){
            hmap.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        Node head2=null,temp2=null;
        temp=head;
        while(temp!=null){
            if(head2==null){
                head2=hmap.get(temp);
                head2.random = hmap.get(temp.random);
                head2.next = hmap.get(temp.next);
                temp2=head2;
            }else{
                temp2.next=hmap.get(temp.next);
                temp2.random = hmap.get(temp.random);
            }
            temp2=temp2.next;
            temp=temp.next;
        }
        return head2;
    }
}