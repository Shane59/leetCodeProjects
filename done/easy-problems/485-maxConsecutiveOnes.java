class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      int count = 0;
      if (nums.length == 0) return 0;
      if (nums[0] == 1) count++;
      int maxCount = count;
      
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] == 1) {
              count++;
              if (count > maxCount) maxCount = count;
          } else {
              count = 0;
          }
      }
      return maxCount;
  }
}