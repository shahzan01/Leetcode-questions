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
    static void helper(TreeNode root ,StringBuilder sb){
        if(root==null){return ;}
         sb.append((char) ('a' + root.val));
if(root.left==null && root.right==null){
    String s=sb.reverse().toString();
    sb.reverse();
    if(min.length()==0 || s.compareTo(min)<0){
    min=s;}
}

helper(root.left,sb);
helper(root.right,sb);

sb.deleteCharAt(sb.length() - 1);


       

    }
    public String smallestFromLeaf(TreeNode root) {
              StringBuilder sb = new StringBuilder();
              min="";
         helper(root,sb);
         return min;
    }
}