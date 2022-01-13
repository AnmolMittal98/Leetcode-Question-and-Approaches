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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);
    }
    public boolean helper(TreeNode root, int targetSum, int sumSoFar){
        if(root==null ){          
            return false;
        }
        sumSoFar+=root.val;
        if(root.left==null && root.right==null && sumSoFar==targetSum){
            return true;       
        }
        boolean l = false;
        boolean r = false;
        if(root.left!=null){
          l = helper(root.left, targetSum, sumSoFar);
            }
        if(root.right!=null){
          r =  helper(root.right, targetSum, sumSoFar);
        }
        
        return l||r;
    }
}