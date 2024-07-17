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
    static void delete(TreeNode root, List<TreeNode> ans, HashSet<Integer> hs) {
        if (hs.isEmpty()) {
            return;

        }

        if (root == null) {
            return;
        }
        delete(root.left, ans, hs);
        delete(root.right, ans, hs);

        if (root.left != null && hs.contains(root.left.val)) {
            hs.remove(root.left.val);
            TreeNode temp = root.left;
            root.left = null;
            if (temp.left != null) {
                ans.add(temp.left);
            }
            if (temp.right != null) {
                ans.add(temp.right);
            }
        }
        if (root.right != null && hs.contains(root.right.val)) {
            hs.remove(root.right.val);
            TreeNode temp = root.right;
            root.right = null;
            if (temp.left != null) {
                ans.add(temp.left);
            }
            if (temp.right != null) {
                ans.add(temp.right);
            }
        }

    }
    public List<TreeNode> delNodes(TreeNode root, int[] tod) {
        
        HashSet<Integer> hs = new HashSet<>();
        List<TreeNode> ans = new ArrayList<>();
        TreeNode temp=new TreeNode(-1);
        temp.right=root;
   
        for (int i = 0; i < tod.length; i++) {
            hs.add(tod[i]);
        }  if(!hs.contains(root.val)){ans.add(root);}
        delete(temp, ans, hs);
        return ans;
    }
}