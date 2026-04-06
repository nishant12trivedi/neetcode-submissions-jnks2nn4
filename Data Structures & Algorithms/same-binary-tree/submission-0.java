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
//DFS
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
         // Case 1: both null
        if (p == null && q == null) return true;
        
        // Case 2: one null OR values different
        if (p == null || q == null || p.val != q.val) return false;
        
        // Check subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
