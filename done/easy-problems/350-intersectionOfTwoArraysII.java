class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      
      int nums1Start = 0;
      int nums2Start = 0;
      
      List<Integer> ansList = new ArrayList<>();
      
      while (nums1Start < nums1.length && nums2Start < nums2.length) {
          if (nums1[nums1Start] == nums2[nums2Start]) {
              ansList.add(nums1[nums1Start]);
          }
          if (nums1[nums1Start] < nums2[nums2Start]) {
              nums1Start++;
          } else if (nums1[nums1Start] > nums2[nums2Start]) {
              nums2Start++;
          } else {
              nums1Start++;
              nums2Start++;
          }
      }
      
      int size = ansList.size();
      int[] ans = new int[size];
      
      for(int i = 0; i < size; i++) {
          ans[i] = ansList.get(i);
      }
      
      return ans;
  }
}