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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<Integer>();
        
        getInorderList(root, inOrderList);
        return inOrderList;
    }
    
    public void getInorderList(TreeNode root, List<Integer> inOrderList){
        
        if(root == null){
            return;
        }
        getInorderList(root.left, inOrderList);
        inOrderList.add(root.val);
        getInorderList(root.right, inOrderList); 
    }
}


// Method-2:
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            inOrderList.add(root.val);
            root = root.right;            
        }
        return inOrderList;
    }
}
