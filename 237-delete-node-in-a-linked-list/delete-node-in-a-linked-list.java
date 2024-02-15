/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
ListNode temp=node;
ListNode prev=temp;
while(temp.next!=null){
int cval=temp.val;
temp.val=temp.next.val;
temp.next.val=cval;
prev=temp;
temp=temp.next;
}
prev.next=null;









    }
}