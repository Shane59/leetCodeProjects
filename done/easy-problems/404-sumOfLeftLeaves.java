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
  public int sumOfLeftLeaves(TreeNode root) {
      int ans = helper(root, "", 0);
      return ans;
  }
  public int helper(TreeNode root, String direction, int sum) {
      if (root == null) {
          return 0;
      }
      if (direction == "left" && root.right == null && root.left == null) {
          sum += root.val;
          return sum;
      }
      return helper(root.right, "right", sum) + helper(root.left, "left", sum);
  }
}