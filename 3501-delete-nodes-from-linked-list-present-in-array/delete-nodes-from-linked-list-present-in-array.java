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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
ListNode cur=head;
ListNode ans=head;
ListNode prev=null;
while(cur!=null){
int v=cur.val;
if( hs.contains(v)&& cur==ans){
    ans=cur.next;
    cur.next=null;
    cur=ans;
}
else if(hs.contains(v)){
prev.next=cur.next;
cur.next=null;
cur=prev.next;
}
else{
prev=cur;
cur=cur.next;
}

}




return ans;

    }
}