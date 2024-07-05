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
    static int[] fxn(ListNode head){

int ans[]={-1,-1};
ListNode curr=head.next;
ListNode prev=head;
int idx=2;
int minlen=Integer.MAX_VALUE;
int cpCount=0;
int firstcp=-1;
int lastcp=-1;
while (curr.next!=null) {
if(prev.val<curr.val && curr.val>curr.next.val){
    cpCount++;
    if(lastcp!=-1){
        minlen=Math.min(minlen, idx-lastcp);
    }
    lastcp=idx;
}
else if(prev.val>curr.val && curr.next.val>curr.val){
    cpCount++;
    if(lastcp!=-1){
        minlen=Math.min(minlen, idx-lastcp);
    }
    lastcp=idx;
}
if(cpCount==1 &&firstcp==-1){firstcp=idx;}
idx++;
prev=curr;
curr=curr.next;
}

if(cpCount<=1){return ans;}

ans[0]=minlen;
ans[1]=lastcp-firstcp;





return ans;



}
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       return fxn(head); 
    }
}