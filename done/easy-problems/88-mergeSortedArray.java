class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] ans = new int[m + n];
      int leftStart = 0;
      int rightStart = 0;
      int ansIndex = 0;
      
      if (nums2.length > 0) {
          while (leftStart < m && rightStart < n) {
              if (nums1[leftStart] >= nums2[rightStart]) {
                  ans[ansIndex++] = nums2[rightStart++];
              } else if (nums1[leftStart] < nums2[rightStart]) {
                  ans[ansIndex++] = nums1[leftStart++];
              }
          }
      
          if (leftStart == m) {
              while (rightStart < n) {
                  ans[ansIndex++] = nums2[rightStart++];
              }
          } else if (rightStart == n) {
              while (leftStart < m) {
                  ans[ansIndex++] = nums1[leftStart++];
              }
          }
          
          for (int i = 0; i < nums1.length; i++) {
              nums1[i] = ans[i];
          }   
      }
  }
}