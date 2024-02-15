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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new   ListNode(-1);
         ListNode prehead=ans;
          ListNode i=list1;
            ListNode  j=list2;

            while(i!=null && j!=null){
if(i.val<=j.val){ ListNode newnode=i;
    ans.next=newnode;i=i.next;ans=newnode;}
else{ ListNode newnode=j;
    ans.next=newnode;j=j.next;ans=newnode;}

            }
if(i==null){ans.next=j;}
if(j==null){ans.next=i;}
return prehead.next;




    }
}