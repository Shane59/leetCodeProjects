class Solution {
  public int singleNumber(int[] nums) {
      Map<Integer, Integer> numList = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          if (!numList.containsKey(nums[i])) {
              numList.put(nums[i], 1);
          } else {
              numList.put(nums[i], numList.get(nums[i]) + 1);
          }
      }
      for (Map.Entry entry: numList.entrySet()) {
          if ((int)entry.getValue() == 1) return (int)entry.getKey();
      }
      return 0;
  }
}