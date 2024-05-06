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
static int fxn(ListNode h){
if(h.next==null){return h.val;}

int m=fxn(h.next);
if(m>h.val){h.val=-1;}
return Math.max(m,h.val);

}


    public ListNode removeNodes(ListNode head) {
        fxn(head);
       ListNode n=new ListNode(0);
       n.next=head; 
ListNode temp=n;
ListNode prev=n;
while(temp.next!=null){
  
    if(temp.val==-1){prev.next=temp.next;}
 else{prev=temp;}
    temp=temp.next;
}
return n.next;



    }
}