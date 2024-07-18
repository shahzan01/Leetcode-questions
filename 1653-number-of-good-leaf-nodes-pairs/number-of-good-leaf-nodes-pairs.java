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
           for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if ((a.get(i) + b.get(j)) <= dis) {
                    count++;
                }
            }
        }
        ArrayList<Integer> par = new ArrayList<>();
        for (Integer i : a) {
            if (i + 1 <= dis) {
                par.add(i + 1);
            }
        }
        for (Integer i : b) {

            if ((i + 1) <= dis) {
                par.add(i + 1);
            }

        }

        return par;

    }
    public int countPairs(TreeNode root, int distance) {
        count=0;

fxn(root,distance);

        return count;
    }
}