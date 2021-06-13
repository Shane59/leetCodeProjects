class Solution {
  public int[] productExceptSelf(int[] nums) {
      // generate the sum for the left side of nums
      int[] leftSum = new int[nums.length];
      leftSum[0] = 1;
      int sum = 1;
      for (int i = 1; i < nums.length; i++) {
          sum *= nums[i - 1];
          leftSum[i] = sum;
      }
      
      // generate the sum for the right side
      int[] rightSum = new int[nums.length];
      rightSum[rightSum.length - 1] = 1;
      int sum2 = 1;
      for (int i = rightSum.length - 2; i >= 0; i--) {
          sum2 *= nums[i + 1];
          rightSum[i] = sum2;
      }
      
      
      
      return multiplyArrays(leftSum, rightSum);
  }
  
  public int[] multiplyArrays(int[] arr1, int[] arr2) {
      int[] ans = new int[arr1.length];
      
      for (int i = 0; i < arr1.length; i++) {
          int temp = arr1[i] * arr2[i];
          ans[i] = temp;
      }
      
      return ans;
  }
}