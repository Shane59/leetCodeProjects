class Solution {
  public int[] twoSum(int[] numbers, int target) {
      int[] ans = new int[2];
      for (int i = 0; i < numbers.length - 1; i++) {
          int pivot = numbers[i];
          int find = target - pivot;
          if (find < 0) break;
          for (int j = i + 1; j < numbers.length; j++) {
              if (numbers[j] == find) {
                  ans[0] = i + 1;
                  ans[1] = j + 1;
                  return ans;
              }
          }
      }
      return ans;
  }
}