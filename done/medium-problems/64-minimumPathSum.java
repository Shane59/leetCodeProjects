// time limit exceeded when the input is really big.
// not a perfect solution but works fine

class Solution {
  public int minPathSum(int[][] grid) {
      return helpMinPathSum(grid, 0, 0);
  }
  
  private int helpMinPathSum(int[][] grid, int crrRow, int crrCol) {
      // baseCase
      int temp = grid[crrRow][crrCol];
      if (!(crrCol < grid[crrRow].length - 1) && !(crrRow < grid.length - 1)) {
          return temp;
      }
      
      if (!(crrRow < grid.length - 1)) {
          return temp + helpMinPathSum(grid, crrRow, crrCol + 1);   
      }
      
      if (!(crrCol < grid[crrRow].length - 1)) {
          return temp + helpMinPathSum(grid, crrRow + 1, crrCol);
      }
      
      return temp +
          Math.min(helpMinPathSum(grid, crrRow, crrCol + 1), helpMinPathSum(grid, crrRow + 1, crrCol));
  }
}
