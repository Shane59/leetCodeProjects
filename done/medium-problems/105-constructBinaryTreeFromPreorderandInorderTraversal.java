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
  static int preIndex;
  
  public TreeNode buildTree(int[] preorder, int[] inorder) {
      preIndex = 0;
      TreeNode tree = recTree(preorder, inorder, 0, inorder.length - 1);
      return tree;
  }
  
  private TreeNode recTree(int[] pre, int[] in, int inStart, int inEnd) {
      if (preIndex >= pre.length || inStart > inEnd) return null;
      TreeNode temp = new TreeNode(pre[preIndex++]);

      if (inStart == inEnd) {
          return temp;
      }
      
      
      
      int indexTil = searchIndex(in, temp.val, inStart, inEnd);
      
      temp.left = recTree(pre, in, inStart, indexTil - 1);
      temp.right = recTree(pre, in, indexTil + 1, inEnd);
      
      return temp;
  }
  
  private int searchIndex(int[] in, int num, int start, int end) {
      for (int i = start; i <= end; i++) {
          if (in[i] == num) {
              return i;
          }
      }
      return -1;
  }
}
