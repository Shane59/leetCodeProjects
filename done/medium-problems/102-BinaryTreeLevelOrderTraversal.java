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
  public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> ans = new ArrayList<>();
      recHelper(ans, root, 0);
      return ans;
  }
  
  private void recHelper(List<List<Integer>> ans, TreeNode n, int level) {
      if (n == null) return;
      level += 1;
      
      if (ans.size() < level) {
          List<Integer> temp = new ArrayList<>();
          temp.add(n.val);
          ans.add(temp);   
      } else {
          ans.get(level - 1).add(n.val);
      }
      
      if (n.left == null && n.right == null) return;
      
      if (n.left != null) recHelper(ans, n.left, level);
      if (n.right != null) recHelper(ans, n.right, level);
  }
}
