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
    static boolean ch=true;
    static boolean dfs(TreeNode root,int tar ){
if(root==null){return false;}
if(root.left==null && root.right==null){if(root.val==tar){return true;}return false;}


boolean l=dfs(root.left,tar);
boolean r=dfs(root.right,tar);
if(l==true){root.left=null;ch=true;}
if(r==true){root.right=null;ch=true;}

return false;

 }


    public TreeNode removeLeafNodes(TreeNode root, int target) {
 ch=true;
while(ch==true){
    System.out.println("sdfsdf");
    ch=false;
dfs(root,target);
}

  

if(root.left==null && root.right==null && root.val==target){return null;}


        return root;
    }
}