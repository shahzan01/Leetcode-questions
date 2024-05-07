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
    
static ListNode rev(ListNode h){
   
ListNode prev=null;
ListNode cur=h;
while(cur!=null){
    ListNode nex=cur.next;
    cur.next=prev;
    prev=cur;
    cur=nex;
}

return  prev;
} 

    public ListNode doubleIt(ListNode head) {
  ListNode temp=rev(head);
int c=0;
ListNode ans=new ListNode(-1);
ListNode t3=ans;
ListNode t2=ans;
ListNode prev=ans;
while(temp!=null){
    int n=(temp.val*2)+c;
if(n>=10){
c=1;ListNode ne=new ListNode(-1);t2.val=(n%10);t2.next=ne;prev=t2;t2=ne;
}
else{
c=0;ListNode ne=new ListNode(-1);t2.val=(n);t2.next=ne;prev=t2;t2=ne;
}
temp=temp.next;

}
if(c==1){ListNode ne=new ListNode(-1);t2.val=(1);t2.next=ne;prev=t2;t2=ne;}
prev.next=null;
return rev(t3);



    }
}