class Solution {
  public int lastStoneWeight(int[] stones) {
      while (stones.length > 1) {
          stones = smashStones(stones);
      }
      if (stones.length < 1) {
          return 0;
      }
      return stones[0];
  }
  
  public int[] smashStones(int[] arr) {
      int biggest = arr[0];
      int secondBiggest = -1;
      int indexOfBiggest = 0;
      int indexOfSecondBiggest = 0;
      int[] newArray;
      for (int i = 1; i < arr.length; i++) {
          if (biggest < arr[i]) {
              secondBiggest = biggest;
              biggest = arr[i];
              indexOfSecondBiggest = indexOfBiggest;
              indexOfBiggest = i;
          } else if (secondBiggest < arr[i]) {
              secondBiggest = arr[i];
              indexOfSecondBiggest = i;
          }
      }
      if (biggest == secondBiggest) {
          newArray = new int[arr.length-2];
          int index = 0;
          for (int i = 0; i < arr.length; i++) {
              if (i != indexOfBiggest && i != indexOfSecondBiggest) {
                  newArray[index++] = arr[i];
              }
          }
      } else {
          int newElement = biggest - secondBiggest;
          int index = 0;
          newArray = new int[arr.length-1];
          for (int i = 0; i < arr.length; i++) {
              if (i == indexOfSecondBiggest) {
                  continue;
              } else if (i == indexOfBiggest) {
                  newArray[index++] = newElement;
              } else {
                  newArray[index++] = arr[i];
              }
          }
      }
      return newArray;
  }
}
