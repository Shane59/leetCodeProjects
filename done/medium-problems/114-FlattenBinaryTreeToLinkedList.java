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
  public void flatten(TreeNode root) {
      // 1.put tree items into list
      List<Integer> itemList = new ArrayList<>();
      preOrderTree(root, itemList);
      System.out.println(Arrays.toString(itemList.toArray()));
      
      // 2.reassign them with the original node
      resssignNodes(root, itemList);
      
  }
  
  private void resssignNodes(TreeNode root, List<Integer> itemList) {
      //reset root
      if (root == null) {
          return;
      }
      root.right = null;
      root.left = null;
      
      for (int i = 1; i < itemList.size(); i++) {
          root.right = new TreeNode(itemList.get(i));
          root = root.right;
      }
  }
  
  private void preOrderTree(TreeNode root, List<Integer> itemList) {
      if (root == null) {
          return;
      }
      itemList.add(root.val);
      preOrderTree(root.left,itemList);
      preOrderTree(root.right,itemList);
  }
}
