class Solution {
    public int rob(TreeNode root) {
        int []result=dfs(root);
        return Math.max(result[0],result[1]);
    }
    private int[] dfs(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int leftPair[]=dfs(root.left);
        int rightPair[]=dfs(root.right);

        int withRoot=root.val+leftPair[1]+rightPair[1];
        int withoutRoot=Math.max(leftPair[0],leftPair[1])+Math.max(rightPair[0],rightPair[1]);

        return new int[]{withRoot,withoutRoot};
    }
}