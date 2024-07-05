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
ArrayList<Integer>li=new ArrayList<>();
ListNode curr=head.next;
ListNode prev=head;
int idx=2;

while (curr.next!=null) {

if(prev.val<curr.val && curr.val>curr.next.val){
    li.add(idx);
}

else if(prev.val>curr.val && curr.next.val>curr.val){
    li.add(idx);
}

idx++;
prev=curr;
curr=curr.next;
}

if(li.size()<=1){return ans;}
int maxlen=li.get(li.size()-1)-li.get(0);
int min=Integer.MAX_VALUE;
for(int i=0;i<li.size()-1;i++){
    min=Math.min(min, li.get(i+1)-li.get(i));
}
ans[0]=min;ans[1]=maxlen;
return ans;

}
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       return fxn(head); 
    }
}