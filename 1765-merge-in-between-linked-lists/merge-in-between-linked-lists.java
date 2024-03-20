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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
      ListNode temp1=list1;
      ListNode temp2=list2;
      int i=b-a+1;
while(a>1){
    temp1=temp1.next;
    a--;
}
temp2=temp1;
while(i>=0){
temp1=temp1.next;
i--;
}
ListNode temp=list2;
while(temp.next!=null){
    temp=temp.next;
}
temp2.next=list2;
temp.next=temp1;
return list1;




    }
}