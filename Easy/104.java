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
  int maxDep = 0;
  public int maxDepth(TreeNode root) {
      countDepth(root, 1);
      return maxDep;
  }
  public void countDepth(TreeNode n, int count) {
      if(n == null) return;
      if(count > maxDep) maxDep = count;
      if(n.left != null) {
          countDepth(n.left, count + 1);   
      }
      if(n.right != null) {
          countDepth(n.right, count + 1);   
      }
  }
}