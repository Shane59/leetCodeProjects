class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
      List<Integer> ansList = new ArrayList<>();
      if (nums1.length > nums2.length) {
          for (int i = 0; i < nums1.length; i++) {
              int element = nums1[i];
              for (int j = 0; j < nums2.length; j++) {
                  if (nums1[i] == nums2[j]) {
                      if (!ansList.contains(nums2[j])) {
                          ansList.add(nums2[j]);   
                      }
                  }
              }
          }   
      } else {
          for (int i = 0; i < nums2.length; i++) {
              int element = nums2[i];
              for (int j = 0; j < nums1.length; j++) {
                  if (nums2[i] == nums1[j]) {
                      if (!ansList.contains(nums1[j])) {
                          ansList.add(nums1[j]);   
                      }
                  }
              }
          }
      }
      int[] ans = new int[ansList.size()];
      for (int i = 0; i < ansList.size(); i++) {
          ans[i] = ansList.get(i);
      }
      return ans;
  }
}