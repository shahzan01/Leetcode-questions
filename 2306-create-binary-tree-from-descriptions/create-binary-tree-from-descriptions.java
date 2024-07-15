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
    public TreeNode createBinaryTree(int[][] arr) {
            int root = arr[0][0];
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer>children=new HashSet<>();
 for (int[] is : arr) {
            int p = is[0];
            int c = is[1];
            int isleft = is[2];
            children.add(c);
            TreeNode head = map.getOrDefault(p, new TreeNode(p));
            TreeNode chi = map.getOrDefault(c, new TreeNode(c));
            if (isleft == 1) {
                head.left = chi;

            } else {
                head.right = chi;
            }
            map.put(c, chi);
            map.put(p, head);

        }
       
      for(int i=0;i<arr.length;i++){
if(!children.contains(arr[i][0])){root=arr[i][0];break;}
      }
return map.get(root);
    }
}