class Solution {
    public boolean isEvenOddTree(TreeNode root) {
         Deque<TreeNode> levelQue = new ArrayDeque<>();
        levelQue.offerLast(root);
        int level = 0;
        while(!levelQue.isEmpty()){
            int currLevelSize = levelQue.size();
            int prevNodeVal = (level % 2 == 0) ? 0 : 1000001;
            while(currLevelSize-->0){
                TreeNode currNode = levelQue.pollFirst();
                int currNodeVal = currNode.val;
                //checks for naming even-odd binary tree
                if(level % 2 == 0){
                    if(prevNodeVal >= currNodeVal || currNodeVal % 2 == 0)return false;
                }else{
                    if(prevNodeVal <= currNodeVal || currNodeVal % 2 == 1)return false;
                }
                prevNodeVal = currNodeVal;
                if(currNode.left != null)levelQue.offerLast(currNode.left);
                if(currNode.right != null)levelQue.offerLast(currNode.right);
            }
            level++;
        }   
        return true;
    }
}