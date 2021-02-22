class Solution {
  public int distanceBetweenBusStops(int[] distance, int start, int destination) {
      int position = start;
      int numOfElements = distance.length;
      int sumDisRight = 0;
      int sumDisLeft = 0;
      
      int positionReverse = start;
      
      while (position != destination) {
          sumDisRight += distance[position];
          if (position == numOfElements - 1) {
              position = 0;
          } else {
              position++;
          }
      }
      
      while (positionReverse != destination) {
          if (positionReverse <= 0) {
              positionReverse = numOfElements - 1;
          } else {
              positionReverse--;
          }
          sumDisLeft += distance[positionReverse];
          
      }
      return Math.min(sumDisRight, sumDisLeft);
  }
}