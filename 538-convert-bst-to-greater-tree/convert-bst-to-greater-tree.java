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
class Solution {    static int rsum=0;
static void bfs(TreeNode root){
    if(root==null){return ;}   
bfs(root.right);
rsum+=root.val;
root.val=(rsum);
bfs(root.left);
return;




}
    public TreeNode convertBST(TreeNode root) {
              rsum=0;
bfs(root);

return root;
    }
}