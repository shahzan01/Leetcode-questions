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
    static int count=0;
    
    
     static ArrayList<Integer> fxn(TreeNode root, int dis) {
        if (root.left == null && root.right == null) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(1);
            return a;
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        if (root.left != null) {
            a = fxn(root.left, dis);
        }

        if (root.right != null) {
            b = fxn(root.right, dis);
        }
          int i = 0;
        int j = 0;
        while (i < a.size()) {
            int cur = a.get(i);
            for (int k = 0; k < b.size(); k++) {
                if ((b.get(k) + cur) <= dis) {
                    count++;
                }
            }

            a.set(i, cur + 1);
            i++;

        }
        while (j < b.size()) {
            a.add(b.get(j) + 1);
            j++;
        }

        System.out.println(a);
        return a;

    }
    public int countPairs(TreeNode root, int distance) {
        count=0;

fxn(root,distance);

        return count;
    }
}