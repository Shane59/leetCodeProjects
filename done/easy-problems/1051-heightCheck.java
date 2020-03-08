class Solution {
  public int heightChecker(int[] heights) {
      int[] sortedArray = new int[heights.length];
      int[] temp = copyArray(heights);
      sortedArray = sortArray(heights);
      return findDif(temp, sortedArray);
  }
  //implementing a bubble sort
  public int[] sortArray(int[] arr) {
      int end = arr.length-1;
      while(end != 0) {
          for(int i=0; i<end; i++) {
              if(arr[i] > arr[i+1]) {
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
              }
          }
          end--;
      }
      return arr;
  }
  //copy array (pass by reference)
  public int[] copyArray(int[] arr) {
      int[] temp = new int[arr.length];
      for(int i=0; i<arr.length; i++) {
          temp[i] = arr[i];
      }
      return temp;
  }
  //find spots where students muct move to sort heights
  public int findDif(int[] arr1, int[] arr2) {
      int count=0;
      for(int i=0; i<arr1.length; i++) {
          if(arr1[i] != arr2[i]) {
              count++;
          }
      }
      return count;
  }
}