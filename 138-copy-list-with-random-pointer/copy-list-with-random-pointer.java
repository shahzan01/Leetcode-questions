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
        if(head==null){return head;}
      HashMap<Node ,Node>hm=new HashMap<>();
       Node res=new Node(-1);
       Node temp=head;
       Node dnode=res;
       while(temp!=null){
           Node a=new Node(temp.val);
           hm.put(temp,a);
           res.next=a;
           temp=temp.next;
           res=res.next;
       }
temp=head;
res=dnode.next;
while(temp!=null){
res.random=hm.get(temp.random);
res=res.next;
temp=temp.next;
}
return dnode.next;









    }
}