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

static ListNode helper(ListNode head){
      if(head==null ){return head;}
   
  
 HashMap<Integer, ListNode> hm = new HashMap<>();
int tar=0;
int sum=0;
hm.put(0,null);
ListNode temp=head;
ListNode ans=head;
while(temp!=null){
     System.out.println(temp.val);
int cur=temp.val;
sum+=cur;
if(hm.containsKey(sum-tar)){
ListNode n=hm.get(sum-tar);
if(n==null){ System.out.println("sdfsdf");return helper(temp.next);}
else{n.next=temp.next;return helper(head);}
}
else{hm.put(sum,temp);}
temp=temp.next;

}
return ans;
}

    public ListNode removeZeroSumSublists(ListNode head) {
     return helper(head);   
    }
}