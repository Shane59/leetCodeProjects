class Solution {
  public int searchInsert(int[] nums, int target) {
      int start = 0;
      int end = nums.length - 1;
      int mid = 0;
      
      if (nums.length == 1) {
          if (target > nums[start]) {
              return 1;
          } else {
              return start;
          }
      }
      
      while (start < end) {
          mid = ((end - start) / 2) + start;
          if (nums[mid] == target) {
              return mid;
          } else if (nums[mid] < target) {
              start = mid + 1;
          } else if (nums[mid] > target) {
              end = mid - 1;
          }
          if (start == end) {
              if (target > nums[end]) {
                  return end + 1;
              } else {
                  return start;
              }
          }
          if (end - start == 1) {
              if (nums[end] == target) {
                  return end;
              }
              if (nums[start] == target) {
                  return start;
              }
              if (target > nums[end]) {
                  return end + 1;
              } else if (target < nums[start]) {
                  return start;
              } else {
                  return end;
              }
          }
      }
      return mid;
  }
}
