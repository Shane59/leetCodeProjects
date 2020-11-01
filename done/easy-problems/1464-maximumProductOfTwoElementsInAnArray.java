class Solution {
  public int maxProduct(int[] nums) {
      int maxNumIndex = getMaxNum(nums);
      int secMaxIndex = getSecMaxNum(nums, maxNumIndex);
      return calcNum(nums, maxNumIndex, secMaxIndex);
  }
  
  public int calcNum(int[] nums, int maxIndex, int secMaxIndex) {
      return (nums[maxIndex] - 1) * (nums[secMaxIndex] - 1);
  }
  
  public int getMaxNum(int[] nums) {
      int max = nums[0];
      int maxIndex = 0;
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] > max) {
              max = nums[i];
              maxIndex = i;
          }
      }
      return maxIndex;
  }
  
  public int getSecMaxNum(int[] nums, int maxIndex) {
      int secMax = Integer.MIN_VALUE;
      int secMaxIndex = 0;
      for (int i = 0; i < nums.length; i++) {
          if (nums[i] > secMax && i != maxIndex) {
              secMax = nums[i];
              secMaxIndex = i;
          }
      }
      return secMaxIndex;
  }
}