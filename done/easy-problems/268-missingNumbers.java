class Solution {
  public int missingNumber(int[] nums) {
      Map<Integer, Boolean> numList = new HashMap<>();
      
      for (int i = 0; i <= nums.length; i++) {
          numList.put(i, false);
      }
      
      for (int i = 0; i < nums.length; i++) {
          numList.put(nums[i], true);
      }
      
      for (Map.Entry entry: numList.entrySet()) {
          if (!(boolean)entry.getValue()) {
              return (int) entry.getKey();
          }
      }
      return 0;
  }
}