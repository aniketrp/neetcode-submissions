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
}
*/
List<Integer> res=new ArrayList<>();
class Solution {
    public List<Integer> postorder(Node root) {
         dfs(root);
         return res;
    }
    void dfs(Node node){
        if(node==null){
            return;
        }
        for(Node c : node.children){
            dfs(c);
        }
        res.add(node.val);
    }
}