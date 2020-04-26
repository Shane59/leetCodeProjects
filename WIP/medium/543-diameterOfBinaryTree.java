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
  int maxPath = 0;
  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) return 0;
    if (root.right == null && (root.left.left == null && root.left.right == null)) {
      if (root.right == null) return 1;
    }
    if (root.left == null && (root.right.right == null && root.right.left == null)) {
      if (root.left == null) return 1;
    }
    if (root.left == null && root.right == null) return 1;
    findMaxPath(root, 0);
    return maxPath;
  }
  public int findMaxPath(TreeNode root, int count) {
    int leftPath = 0;
    int rightPath = 0;
    if (root.left != null) {
      leftPath = countPath(root.left, 1);
    } 
    if (root.right != null) {
      rightPath = countPath(root.right, 1);
    }
    int sumPath = leftPath + rightPath;
    if (maxPath < sumPath) {
        maxPath = sumPath;
    }
    return maxPath;
  }
  public int countPath(TreeNode root, int numOfPath) {
    if(root == null) return numOfPath;
    if (root.left != null) {
      return 1 + countPath(root.left, numOfPath);
    }
    if (root.right != null) {
      return 1 + countPath(root.right, numOfPath);
    }
    return numOfPath;
  }
}