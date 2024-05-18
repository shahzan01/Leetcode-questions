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
 static class pair {
        int x;
        int y;

        public pair(int i, int j) {
            this.x = i;
            this.y = j;
        }
    }
static pair dfs(TreeNode root){
    if(root==null){return new pair(0,0);}
    if(root.left==null && root.right==null){int v=root.val-1;return new pair(v,Math.abs(v));}

pair r=dfs(root.right);
pair l=dfs(root.left);

int v=root.val-1+r.x+l.x;
System.out.println(v);
return new pair(v,Math.abs(v)+r.y+l.y);












}


    public int distributeCoins(TreeNode root) {


pair ans=dfs(root);
return ans.y;



    }
}