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
    // Helper function to find the height of a node
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    
    // Helper function to find the smallest subtree containing all deepest nodes
    public TreeNode subtreeWithAllDeepestHelper(TreeNode root) {
        if (root == null) {
            return null;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        // If both subtrees have equal height, root is the common ancestor
        if (leftHeight == rightHeight) {
            return root;
        }
        // If left subtree is deeper, recurse into left subtree
        else if (leftHeight > rightHeight) {
            return subtreeWithAllDeepestHelper(root.left);
        }
        // If right subtree is deeper, recurse into right subtree
        else {
            return subtreeWithAllDeepestHelper(root.right);
        }
    }
    
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return null;
        }
        return subtreeWithAllDeepestHelper(root);
    }
}
