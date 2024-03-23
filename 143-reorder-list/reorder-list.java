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
static ListNode rev(ListNode head){
    if(head==null || head.next==null){return head;}
ListNode prev=null;
ListNode cur=head;
while(cur!=null){
ListNode next=cur.next;
cur.next=prev;
prev=cur;
cur=next;

}
return prev;


    
}



    public void reorderList(ListNode head) {
        if(head==null || head.next==null){return ;}
ListNode slow=head;
ListNode fast =head;

while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}

ListNode temp=slow.next;

slow.next=null;
temp=rev(temp);
slow=head;
ListNode temp2=temp;
while(slow!=null && temp!=null){
fast=slow.next;
temp2=temp.next;
slow.next=temp;
temp.next=fast;
slow=fast;
temp=temp2;
}







    }
}