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
    public ListNode rev(ListNode h){
        if(h==null || h.next==null){return h;}
        ListNode temp=h;
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
if(head==null || head.next==null){return true;}
ListNode s=head;
ListNode f=head;

while(f.next!=null && f.next.next!=null){
s=s.next;
f=f.next.next;
}
ListNode nex=s.next;
s.next=null;
s=head;
ListNode r=rev(nex);
while(r!=null && s!=null){
    if(s.val!=r.val){return false;}
    s=s.next;
    r=r.next;
}

return true;



    }
}