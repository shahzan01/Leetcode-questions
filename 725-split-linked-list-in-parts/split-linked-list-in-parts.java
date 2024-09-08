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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[]=new ListNode[k];
ListNode cur=head;
int len=0;
while(cur!=null){
len++;
cur=cur.next;
}
int mod=len%k;
int div=len/k;
cur=head;
int idx=0;
for(int i=0;i<mod;i++){
    ListNode node=new ListNode();
    ListNode temp=node;
for(int j=0;j<div+1;j++){
    temp.next=new ListNode(cur.val);
    cur=cur.next;
    temp=temp.next;
}
ans[idx]=node.next;
idx++;
}
for(int i=0;i<k-mod;i++ ){
 ListNode node=new ListNode();
    ListNode temp=node;
for(int j=0;j<div;j++){
    temp.next=new ListNode(cur.val);
    cur=cur.next;
    temp=temp.next;
}
ans[idx]=node.next;
idx++;
}

return ans;





    }
}