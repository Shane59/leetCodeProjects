class Solution {
  public int findKthLargest(int[] nums, int k) {
      //sort array
      // Arrays.sort(nums);
      sortArray(nums);
      System.out.println(Arrays.toString(nums));
      return nums[k-1];
  }
  public void sortArray(int[] nums) {
      if(nums.length==1) {
          return;
      }
      int mid = nums.length/2;
      int[] left = new int[mid];
      int[] right = new int[nums.length - mid];
      
      //inplementing left side of array
      for(int i=0; i<left.length; i++) {
          left[i] = nums[i];
      }
      //inplementing right side of array
      for(int i=mid; i<nums.length; i++) {
          right[i - mid] = nums[i];
      }
      sortArray(left);
      sortArray(right);
      mergeSort(nums, left, right);
  }
  public int[] mergeSort(int[] temp, int[] left, int[] right) {
      int i = 0;
      int leftIndex = 0;
      int rightIndex = 0;
      while(leftIndex<left.length && rightIndex<right.length){
          if(left[leftIndex]>=right[rightIndex]){
              temp[i] = left[leftIndex];
              leftIndex++;
          }
          else if(right[rightIndex]>=left[leftIndex]){
              temp[i] = right[rightIndex];
              rightIndex++;
          }
          i++;
      }
      while(rightIndex<right.length){
          temp[i] = right[rightIndex];
          i++;
          rightIndex++;
      }
      while(leftIndex<left.length){
          temp[i] = left[leftIndex];
          i++;
          leftIndex++;
      }
      return temp;
  }
}