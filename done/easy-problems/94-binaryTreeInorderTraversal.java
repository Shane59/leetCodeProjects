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
  public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> ans = new ArrayList<>();
      ans = helper(root, ans);
      return ans;
  }
  
  private List<Integer> helper(TreeNode root, List<Integer> ans) {
      if (root != null) {
          if (root.left != null) {
              helper(root.left, ans);
          }
          ans.add(root.val);
          if (root.right != null) {
              helper(root.right, ans);
          }
      }
      return ans;
  }
}
