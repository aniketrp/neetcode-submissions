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
    boolean isSame=true;
    public void trav(TreeNode p,TreeNode q){
        if(p==null && q!= null) isSame=false;
        if(q==null && p!= null) isSame=false;
        if(p==null || q== null) return;
        System.out.println(p.val +" "+q.val);
        trav(p.left,q.left);
        trav(p.right,q.right);
        if(p.val!=q.val){
            isSame=false;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        trav(p,q);
        return isSame;
    }
}
