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
   static String min="";
    static void helper(TreeNode root ,StringBuilder sb,StringBuilder ans){
        if(root==null){return ;}
         sb.append((char) ('a' + root.val));
if(root.left==null && root.right==null){
    String s=sb.reverse().toString();
    sb.reverse();
    if(ans.length()==0 || s.compareTo(ans.toString())<0){
       ans.setLength(0);
       ans.append(s); 
    }
}

helper(root.left,sb,ans);
helper(root.right,sb,ans);

sb.deleteCharAt(sb.length() - 1);


       

    }
    public String smallestFromLeaf(TreeNode root) {
              StringBuilder sb = new StringBuilder();
               StringBuilder ans = new StringBuilder();
         helper(root,sb,ans);
         return ans.toString();
    }
}