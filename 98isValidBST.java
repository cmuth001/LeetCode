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
    public boolean isValidBST(TreeNode root) {
        
        return isValidNode(root, null, null);
    }
    public boolean isValidNode(TreeNode node, Integer lower, Integer upper){
        if(node == null) return true;
        
        int val = node.val;
        if(lower != null && lower>=val) return false;
        if(upper != null && upper<=val) return false;
        
        if( !isValidNode(node.left, lower, val) ) return false;
        if( !isValidNode(node.right, val, upper)) return false;
        
        return true;
        
        
    }
}
