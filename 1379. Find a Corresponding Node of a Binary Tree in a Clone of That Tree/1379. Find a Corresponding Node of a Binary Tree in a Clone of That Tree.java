/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{original, cloned});
        while(!stack.isEmpty()){
            TreeNode[] nodePair = stack.pop();
            TreeNode originalNode = nodePair[0];
            TreeNode clonedNode = nodePair[1];
            if(originalNode == target){
                return clonedNode;
            }
            if(originalNode.left != null){
                stack.push(new TreeNode[]{originalNode.left, clonedNode.left});
            }
            if(originalNode.right != null){
                stack.push(new TreeNode[]{originalNode.right, clonedNode.right});
            }
        }
        return null;
    }
}
