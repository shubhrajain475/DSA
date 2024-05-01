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
    String smallestString = "";
    private void solve(TreeNode root, String currentString) {
        if(root == null) return;

        currentString = (char)(root.val + 'a') + currentString;
        if(root.left == null && root.right == null) {
            if(smallestString.isEmpty() || smallestString.compareTo(currentString) > 0) {
                smallestString = currentString;
            }
        }

        solve(root.left, currentString);

        solve(root.right, currentString);
    }

    public String smallestFromLeaf(TreeNode root) {
        solve(root, "");
        return smallestString;
    }
}