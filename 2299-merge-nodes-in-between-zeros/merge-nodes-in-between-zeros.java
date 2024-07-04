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
    public ListNode mergeNodes(ListNode head) {
        ListNode h=head;

ListNode modify=head;
head=head.next;
while(head!=null){
    int sum=0;
    while(head.val!=0){
        sum+=head.val;
        head=head.next;
    }
    modify.next.val=sum;
    modify=modify.next;
    head=head.next;
}
  modify.next=null;
return h.next;



    }
}