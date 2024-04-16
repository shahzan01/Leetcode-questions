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

static TreeNode helper(TreeNode root,int v,int d,int cur){
    if(root==null){return null;}
if(cur==d-1){
    TreeNode l=new TreeNode(v);TreeNode r=new TreeNode(v);
 
TreeNode templ= (root.left!=null?root.left:null);
TreeNode tempr= (root.right!=null?root.right:null);
root.left=l;root.right=r;
l.left=templ;r.right=tempr;
return root;
}

root.left=helper(root.left,v,d,cur+1);
root.right=helper(root.right,v,d,cur+1);
return root;
}


    public TreeNode addOneRow(TreeNode root, int v, int d) {
       if(d==1){TreeNode n=new TreeNode(v);n.left=root;return n;} 
       return  helper(root,v,d,1);
      
    }
}