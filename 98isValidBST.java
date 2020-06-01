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

// 2nd method
class Solution {
    LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    LinkedList<Integer> uppers = new LinkedList<Integer>();
    LinkedList<Integer> lowers = new LinkedList<Integer>();
    public void updateStack(TreeNode node, Integer lower, Integer upper){
        stack.add(node);
        lowers.add(lower);
        uppers.add(upper);
    }
    public boolean isValidBST(TreeNode root) {
        Integer upper = null, lower = null, val;
        updateStack(root, lower, upper);
        while(!stack.isEmpty()){
            root = stack.poll();
            lower = lowers.poll();
            upper = uppers.poll();
            if(root == null) continue;
            val = root.val;
            if(lower != null && lower>=val) return false;
            if(upper != null && upper <= val) return false;
            
            updateStack(root.left, lower, val);
            updateStack(root.right, val, upper);
        }
        return true;
        
    }
}
