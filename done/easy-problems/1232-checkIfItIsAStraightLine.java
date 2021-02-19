class Solution {
  public boolean checkStraightLine(int[][] coordinates) {
      int numOfPoints = coordinates.length;
      if (numOfPoints == 2) return true;
      
      int firstX = coordinates[0][0];
      int firstY = coordinates[0][1];
      int secondX = coordinates[1][0];
      int secondY = coordinates[1][1];
      
      double slope = (double) (secondY - firstY) / (secondX - firstX);
      
      if ((secondX - firstX) == 0) {
          for (int i = 2; i < numOfPoints; i++) {
              if (coordinates[i][0] - coordinates[i - 1][0] != 0) return false;
          }
          return true;
      }
      
      for (int i = 2; i < numOfPoints; i++) {
          double currentSlope = (double) (coordinates[i][1] - firstY) / (coordinates[i][0] - firstX);
          if (currentSlope != slope) {
              return false;
          }
      }
      return true;
  }
}