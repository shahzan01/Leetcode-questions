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
    public List<Integer> preorderTraversal(TreeNode root) {
          TreeNode cur=root;
        List<Integer>ans=new ArrayList<>();
        while(cur!=null){
if(cur.left==null){
    ans.add(cur.val);
    cur=cur.right;
}
else{  
TreeNode t=cur.left;
while(t.right!=null && t.right!=cur){
t=t.right;
}
if(t.right==null){
    ans.add(cur.val);
t.right=cur;
cur=cur.left;
}
else{

cur=cur.right;
}



}




        }


return ans;
    }
}