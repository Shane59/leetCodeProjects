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
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      if(t1 != null && t2 != null) {
          // add two values
          TreeNode mergedNode = new TreeNode(t1.val + t2.val);
          mergedNode.left = mergeTrees(t1.left, t2.left);
          mergedNode.right = mergeTrees(t1.right, t2.right);
          return mergedNode;
      }
      else if(t1 == null) {
          return t2;
      }
      else {
          return t1;
      }
  }
}