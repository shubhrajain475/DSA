//Path sum III
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
    int cnt=0;
    void helper(TreeNode root,int targetSum){
        if(root==null)return;
        countPaths(root,targetSum);
        helper(root.left,targetSum);
        helper(root.right,targetSum);
    }
    void countPaths(TreeNode node,long targetSum){
        if(node==null)return;
        if(node.val==targetSum){
            cnt++;
        }
        countPaths(node.left,targetSum-node.val);
        countPaths(node.right,targetSum-node.val);

    }
    public int pathSum(TreeNode root, int targetSum) {
      helper(root,targetSum);
      return cnt;
    }
}