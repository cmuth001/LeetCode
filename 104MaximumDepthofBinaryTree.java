class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        
        return Math.max(left_depth, right_depth)+1;
    }
}

// 2nd Method
class Solution {
    int answer = 0;
    public int maxDepth(TreeNode root) {
        return answer;
        
    }
    public void max_depth(TreeNode root, int depth){
        if (root == null) return;
        
        if (root.left == null && root.right == null){
            answer = Math.max(answer, depth);
        }
        max_depth(root.left, depth+1);
        max_depth(root.right, depth+1);
        
    }
}
