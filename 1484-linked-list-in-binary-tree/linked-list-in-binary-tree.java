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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
static boolean hel( List<Integer>li,TreeNode root,int idx ){

    if(idx>=li.size()){return true;}
    if(root==null){return false;}
if(root.val!=li.get(idx)){return false;}
return hel(li,root.left,idx+1) || hel(li,root.right,idx+1);

}
static boolean dfs(TreeNode root,int s,List<Integer>li){
    if(root==null){return false;}
if(root.val==s){if(hel(li,root,0)){return true;}}
return dfs(root.left,s,li) || dfs(root.right,s,li);


}


    public boolean isSubPath(ListNode head, TreeNode root) {
        List<Integer>li=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            li.add(cur.val);
            cur=cur.next;
        }
        return dfs(root,li.get(0),li);
// System.out.println(li);






    }
}