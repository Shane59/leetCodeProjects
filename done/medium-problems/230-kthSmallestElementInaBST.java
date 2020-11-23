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
  public int kthSmallest(TreeNode root, int k) {
      List<Integer> treeList = new ArrayList<>();
      inOrder(root, treeList);
      Collections.sort(treeList);
      return findKth(treeList, k);
  }
  
  private void inOrder(TreeNode node, List treeList) {
      if (node == null) return;
      
      inOrder(node.left, treeList);
      treeList.add(node.val);
      inOrder(node.right, treeList);
  }
  
  private int findKth(List treeList, int k) {
      int kth = (int) treeList.get(0);
      int order = 1;
      for (int i = 1; i < treeList.size() && order < k; i++) {
          if ((int) treeList.get(i) > kth) {
              kth = (int) treeList.get(i);
              order++;
          }
      }
      return kth;
  }
}