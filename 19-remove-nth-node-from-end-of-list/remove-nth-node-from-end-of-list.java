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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode last=head;
         int size=1;
         while(last.next!=null){
             last=last.next;
             size++;
         }
         ListNode ne=null;
         if(size==1){return ne;}
         if(size==n){return head.next;}
         n=size-n;
         last=head;
          ListNode prev=head;
         while(last.next!=null && n>0){
             prev=last;
last=last.next;
n--;

         }
prev.next=last.next;


return head;


    }
}