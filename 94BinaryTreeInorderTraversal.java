/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList=new ArrayList<Integer>();

//         ***** DFS ****
//         getInorderList(root, inOrderList);
//         return inOrderList;
        
//     }
//     public void getInorderList(TreeNode root, List<Integer> inOrderList){
//         if(root == null){
//             return;
//         }
//     getInorderList(root.left, inOrderList);
//     inOrderList.add(root.val);
//      getInorderList(root.right, inOrderList);
//     }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.empty()) {
            while (root != null) {
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
