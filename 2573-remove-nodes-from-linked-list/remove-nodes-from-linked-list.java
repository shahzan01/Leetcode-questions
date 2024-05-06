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
static int fxn(ListNode h){
if(h.next==null){return h.val;}

int m=fxn(h.next);
if(m>h.val){h.val=-1;}
return Math.max(m,h.val);

} 
  public ListNode removeNodes(ListNode head) {
  if(head.next==null){return head;}     
Stack<Integer> st=new Stack<>();
ListNode t=head;

while(t!=null){
    int a=t.val;
    while (!st.isEmpty() && st.peek()<a) {
    st.pop();
}
st.push(a);
t=t.next;
}
 t=null;
while(!st.isEmpty()){
    ListNode n=new ListNode(st.pop());
n.next=t;
t=n;
}
return t;



    }
}