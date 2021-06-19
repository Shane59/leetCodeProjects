class Solution {
  public void rotate(int[][] matrix) {
      Queue<Integer> numQueue = new LinkedList<>();
      generateQueue(numQueue, matrix);

      rotateList(matrix, numQueue);
  }
  
  private void generateQueue(Queue<Integer> q, int[][] list) {
      for (int i = 0; i < list.length; i++) {
          for (int j = 0; j < list[i].length; j++) {
              q.add(list[i][j]);
          }
      }
  }
  
  private void rotateList(int[][] list, Queue<Integer> q) {
      int lastIndex = list[0].length - 1;
      
      while (lastIndex >= 0) {
          for (int i = 0; i < list.length; i++) {
              list[i][lastIndex] = q.remove();
          }
          lastIndex--;
      }
  }
  
}