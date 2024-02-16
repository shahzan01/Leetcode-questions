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
    public ListNode reverse(ListNode h){
        if(h.next==null){return h;}
        ListNode prev=null;
        ListNode curr=h;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null || head==null){return head;}
        if(k==1){return head;}
ListNode temp=head;
int len=0;
while(temp!=null){
    len++;
    temp=temp.next;
}
if(k==len){return reverse(head);}

int loop=len/k;
int count=k;
 temp=head;
ListNode knode=head;
ListNode prev=null;
while(loop>0){
    loop--;
count=k;
while(count>1){
knode=knode.next;count--;
}
ListNode nexnode=knode.next;
knode.next=null;
ListNode h= reverse(temp);
if(temp==head){head=knode;}
temp.next=nexnode;
if(prev!=null){prev.next=knode;}
prev=temp;
temp=nexnode;
knode=nexnode;

}

return head;

    }
}