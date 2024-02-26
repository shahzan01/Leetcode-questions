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
    static boolean helper(TreeNode a,TreeNode b){
 if(a==null && b==null){return true;}
 if(a==null && b!=null){return false;}
 if(a!=null && b==null){return false;}
if(a.val!=b.val){return false;}

boolean l=helper(a.left,b.left);
boolean r=helper(a.right,b.right);
return l&&r;

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
     
return helper(p,q);



    }
}