class Solution {
    public Node cloneGraph(Node node) {
        Map<Node,Node> clone=new HashMap<>();
        return dfs(node,clone);
    }
    Node dfs(Node node,Map<Node,Node> clone){
        if(node==null){
            return null;
        }
        if(clone.containsKey(node)){
            return clone.get(node);
        }
        Node copy=new Node(node.val);
        clone.put(node,copy);
        for(Node adj: node.neighbors){
            copy.neighbors.add(dfs(adj,clone));
        }
        return copy;
    }
}