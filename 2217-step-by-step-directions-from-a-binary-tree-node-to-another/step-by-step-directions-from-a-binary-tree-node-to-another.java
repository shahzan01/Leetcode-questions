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
 static void dfsTree(TreeNode root, StringBuilder sb, int src, int des, String arr[]) {
        if (root == null) {
            return;
        }
        if (root.val == des) {
            arr[1] = sb.toString();
         
        }
        if (root.val == src) {
            arr[0] = sb.toString();
           
        }
        sb.append("L");
        dfsTree(root.left, sb, src, des, arr);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("R");
        dfsTree(root.right, sb, src, des, arr);

        sb.deleteCharAt(sb.length() - 1);
        return;
    }

    public String getDirections(TreeNode root, int src, int des) {
        
StringBuilder sb = new StringBuilder();
        String arr[] ={"",""};
        
        dfsTree(root, sb, src, des, arr);
      
        StringBuilder ans = new StringBuilder();
       int i=0;
int j=0;
while (i<arr[0].length() && j<arr[1].length() && arr[0].charAt(i)== arr[1].charAt(j)) {
   i++;j++;

}
while (i<arr[0].length()) {
    ans.append("U");i++;
}
while (j<arr[1].length()) {
    ans.append(arr[1].charAt(j));j++;
}
     return ans.toString();




    }
}