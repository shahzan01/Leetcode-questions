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
    static int max=0;
    static int md=-1;
    static void he(TreeNode root,int d){
if(root==null){return;}
if(md<d){md=d;max=root.val;}
he(root.left,d+1);
he(root.right,d+1);
return;



    }
    public int findBottomLeftValue(TreeNode root) {
        max=0;
        md=-1;
        he(root,0);
        return max;
    }
}