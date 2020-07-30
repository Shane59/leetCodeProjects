class Solution {
  public int[] sortArray(int[] nums) {
      mergeSort(nums);
      return nums;
  }
  public void mergeSort(int[] nums) {
      if (nums.length == 1) {
          return;
      }
      int mid = nums.length / 2;
      int[] left = new int[mid];
      int[] right = new int[nums.length - mid];
      
      for (int i = 0; i < left.length; i++) {
          left[i] = nums[i];
      }
      
      int index = 0;
      for (int i = mid; i < nums.length; i++) {
          right[index++] = nums[i];
      }
      mergeSort(left);
      mergeSort(right);
      merge(nums, left, right);
  }
  public void merge(int[] nums, int[] left, int[] right) {
      int leftStart = 0;
      int rightStart = 0;
      int index = 0;
      while (leftStart < left.length && rightStart < right.length) {
          if (left[leftStart] <= right[rightStart]) {
              nums[index++] = left[leftStart++];
          } else {
              nums[index++] = right[rightStart++];
          }
      }
      while (leftStart < left.length) {
          nums[index++] = left[leftStart++];
      }
      while (rightStart < right.length) {
          nums[index++] = right[rightStart++];
      }
  }
}