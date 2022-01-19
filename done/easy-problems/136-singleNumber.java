class Solution {
  public int singleNumber(int[] nums) {
      Arrays.sort(nums);
      int prev = nums[0];
      for (int i = 1; i < nums.length - 1; i+=2) {
          int curr = nums[i];
          if (prev != curr) return prev;
          prev = nums[i + 1];
      }
      return prev;
  }
} 
