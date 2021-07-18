class Solution {
  public int kthSmallest(int[][] matrix, int k) {
      List<Integer> numList = new ArrayList<>();
      generateList(numList, matrix);
      Collections.sort(numList);
      return numList.get(k - 1);
  }
  
  private void generateList(List<Integer> numList, int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              numList.add(matrix[i][j]);
          }
      }
  }

}
