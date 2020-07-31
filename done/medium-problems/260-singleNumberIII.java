class Solution {
  public int[] singleNumber(int[] nums) {
      Map<Integer, Integer> numMap = new HashMap<>();
      
      for (int i = 0; i < nums.length; i++) {
          if (numMap.containsKey(nums[i])) {
              numMap.put(nums[i], numMap.get(nums[i]) + 1);
          } else {
              numMap.put(nums[i], 1);
          }
      }
      List<Integer> numList = new ArrayList<>();
      for (Map.Entry entry: numMap.entrySet()) {
          if ((int)entry.getValue() == 1) {
              numList.add((Integer)entry.getKey());
          }
      }
      int[] ans = new int[numList.size()];
      for (int i = 0; i < numList.size(); i++ ) {
          ans[i] = numList.get(i);
      }
      return ans;
  }
}