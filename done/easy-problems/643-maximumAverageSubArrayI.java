class Solution {
  public double findMaxAverage(int[] nums, int k) {
      double maxAve = Double.NEGATIVE_INFINITY;
      for (int i = 0; i <= nums.length - k; i++) {
          int[] part = Arrays.copyOfRange(nums, i, i + k);
          double ave = calcAve(part);
          if (ave > maxAve) maxAve = ave;
      }
      return maxAve;
  }
  public static double calcAve(int[] nums) {
      int sum = 0;
      for (int i = 0; i < nums.length; i++) {
          sum += nums[i];
      }
      return (double) sum / nums.length;
  }
}