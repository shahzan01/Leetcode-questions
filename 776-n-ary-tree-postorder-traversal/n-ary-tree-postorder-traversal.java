/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    static void dfs(List<Integer> ans,Node root){
        if(root==null){return ;}
List<Node>li=root.children;
for(int i=0;i<li.size();i++){
    dfs(ans,li.get(i));
}
ans.add(root.val);



    }
    public List<Integer> postorder(Node root) {
List<Integer>  ans=new ArrayList<>();
 dfs(ans,root);
return ans;




    }
}