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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.abs(rightHeight - leftHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

   // Default method to calculate height //
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = 1 + Math.max(leftHeight, rightHeight);
        return height;
    }
}
