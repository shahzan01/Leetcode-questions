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
            children.add(c);
            if (root == c) {
                root = p;
            }
            if (map.containsKey(p)) {

                TreeNode head = map.get(p);
                if (map.containsKey(c)) {

                    if (is[2] == 1) {
                        head.left = map.get(c);
                    } else {
                        head.right = map.get(c);
                    }
                } else {
                    TreeNode n = new TreeNode(c);
                    if (is[2] == 1) {
                        head.left = n;
                    } else {
                        head.right = n;
                    }
                    map.put(c, n);
                }

            }

            else {

                TreeNode head = new TreeNode(p);
                if (map.containsKey(c)) {

                    if (is[2] == 1) {
                        head.left = map.get(c);
                    } else {
                        head.right = map.get(c);
                    }
                } else {
                    TreeNode n = new TreeNode(c);
                    if (is[2] == 1) {

                        head.left = n;
                    } else {
                        head.right = n;
                    }
                    map.put(c, n);
                }
                map.put(p, head);

            }

        }
       
      for(int i=0;i<arr.length;i++){
if(!children.contains(arr[i][0])){root=arr[i][0];break;}
      }
return map.get(root);
    }
}