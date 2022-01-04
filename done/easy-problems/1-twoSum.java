class Solution {
  public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];
      Map<Integer, Integer> numMap = new HashMap<>();
      
      for (int i = 0; i < nums.length; i++) {
          if (numMap.containsKey(target - nums[i])) {
              result[0] = i;
              result[1] = numMap.get(target - nums[i]);
              return result;
          } else {
              numMap.put(nums[i], i);
          }
      }
      return result;
  }
}
