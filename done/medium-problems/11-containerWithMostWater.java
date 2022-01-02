class Solution {
  public int maxArea(int[] height) {
      int max = 0;
      
      int left = 0;
      int right = height.length - 1;
      
      while (left < right) {
          // when left id higher
          if (height[left] > height[right]) {
              int tempHeight = height[right];
              max = Math.max(max, tempHeight * (right - left));
              right--;
          } else {
              int tempHeight = height[left];
              max = Math.max(max, tempHeight * (right - left));
              left++;
          }
      }
      
      return max;
  }
