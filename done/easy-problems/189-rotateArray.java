class Solution {
  public void rotate(int[] nums, int k) {
      int round = 0;
      while (round < k) {
          int lastNum = nums[nums.length - 1];
          for (int i = nums.length - 1; i > 0; i--) {
              nums[i] = nums[i - 1];
          }
          nums[0] = lastNum;
          round++;
      }
  }
}