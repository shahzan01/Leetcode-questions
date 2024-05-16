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
    static boolean dfs(TreeNode root){
if(root.left==null && root.right==null ){return root.val==0?false:true;}

boolean l=dfs(root.left);
boolean r=dfs(root.right);

if(root.val==2){return r||l;}
return r&&l;

    }
    public boolean evaluateTree(TreeNode root) {
        
return dfs(root);

    }
}