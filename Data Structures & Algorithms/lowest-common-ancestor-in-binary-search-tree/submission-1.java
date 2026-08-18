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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode leftA=lowestCommonAncestor(root.left,p,q);
        TreeNode rightA=lowestCommonAncestor(root.right,p,q);

        if(leftA!=null && rightA!=null){
            return root;
        }else if(leftA!=null){
            return leftA;
        }else{
            return rightA;
        }
    }
}
