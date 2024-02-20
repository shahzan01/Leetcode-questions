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
        int size=0;
        if(head==null || head.next==null){return head;}




ListNode temp=head;
while(temp!=null){
    size++;
    temp=temp.next;
}
if(k>size){while(k>size){k=k-size;}}
if(k==size || k==0){return head;}
temp=head;
if(k<size){int loop=size-k;
   while(loop-1>0){temp=temp.next;loop--;} 
ListNode n=temp.next;
temp.next=null;
temp=n;
while(n.next!=null){n=n.next;}
n.next=head;

}
return temp;





    }
}