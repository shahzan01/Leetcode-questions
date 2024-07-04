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
ListNode ans=new ListNode();
ListNode t=ans;
int sum=0;
head=head.next;
while(head!=null){
if(head.val==0){
ListNode n=new ListNode(sum);
t.next=n;
t=n;
sum=0;
}
else{
    sum+=head.val;
}
head=head.next;
}




return ans.next;

    }
}