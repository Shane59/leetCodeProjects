class Solution {
  public boolean containsDuplicate(int[] nums) {
      Map<Integer, Integer> numList = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          if (numList.containsKey(nums[i])) {
              return true;
          }
          numList.put(nums[i], 1);
      }
      return false;
  }
}
