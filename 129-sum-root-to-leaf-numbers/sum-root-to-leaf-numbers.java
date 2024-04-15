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

static int helper(TreeNode root,int n){

n=(n*10)+root.val;
  if(root.left==null && root.right==null){
  
    int a=n;n/=10;
    return a;
  }int left=0;
  int right=0;
if(root.left!=null){left=helper(root.left,n);}
if(root.right!=null){right=helper(root.right,n);}


return left+right;
}

    public int sumNumbers(TreeNode root) {
       
         int n=0;
     return    helper(root,n);
          
    }
}