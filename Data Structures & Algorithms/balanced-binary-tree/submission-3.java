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
    boolean isGreater = true;
    public int trav(TreeNode root) {
        if (root == null) return 0;

       int lefth = trav(root.left);
       int righth = trav(root.right);
        System.out.println("node is " + root.val + " " + Math.abs(lefth - righth));
        if (Math.abs(lefth - righth) > 1) {
            isGreater = false;
        }
        return Math.max(lefth, righth) + 1;

    }
    public boolean isBalanced(TreeNode root) {
        trav(root);
        return isGreater;
    }
}
