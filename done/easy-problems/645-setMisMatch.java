class Solution {
  public int[] findErrorNums(int[] nums) {
      //find the max num
      int maxNum = nums.length;
      
      //crate a map
      Map<Integer, Integer> numsMap = new HashMap<>();
      for (int i = 1; i <= nums.length; i++) {
          numsMap.put(i, 0);
      }
      
      for (int i = 0; i < nums.length; i++) {
          if (numsMap.containsKey(nums[i])) {
              numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
          }
      }
      
      int[] ans = new int[2];
      
      for (Map.Entry<Integer, Integer> temp: numsMap.entrySet()) {
          if (temp.getValue() == 2) {
              ans[0] = temp.getKey();
          } else if (temp.getValue() == 0) {
              ans[1] = temp.getKey();
          }
      }
      
      return ans;
  }
}