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
     static long hel(TreeNode root,int k){
        List<Long>li=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
q.add(root);
q.add(null);
long sum=0;
while (!q.isEmpty()) {
    TreeNode cur=q.poll();
    if(cur==null){
        li.add(sum);
        sum=0;
        if(q.isEmpty()){break;}
        else{
            q.add(null);
        }
    }
    else{
if(cur.left!=null){
q.add(cur.left);
}
if(cur.right!=null){
    q.add(cur.right);
}
sum+=cur.val;

    }



}
if(li.size()<k){return (long)-1;}
Collections.sort(li);
return li.get(li.size()-k);




    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        return hel(root,k);
    }
}