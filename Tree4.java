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
    public int diff(TreeNode root,int min,int max){
            if(root==null){
                return Math.abs(max-min);
            }
            min=Math.min(root.val,min);
            max=Math.max(root.val,max);
            int l=diff(root.left,min,max);
            int r=diff(root.right,min,max);
            return Math.max(l,r);
    }
    public int maxAncestorDiff(TreeNode root) {
        return diff(root,root.val,root.val);
    }
}