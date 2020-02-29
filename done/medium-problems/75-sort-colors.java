class Solution {
  public void sortColors(int[] nums) {
      Map<Integer, Integer> numList = new HashMap<>();
      int[] ans = new int[nums.length];
      //generate number of colors
      for(int i=0; i<nums.length; i++) {
          if(numList.containsKey(nums[i])) {
              numList.put(nums[i], numList.get(nums[i]) + 1);
          }
          else {
              numList.put(nums[i], 1);
          }
      }
      int index = 0;
      for (Map.Entry<Integer, Integer> entry: numList.entrySet()) {
          int count = 0;
          while(count < entry.getValue()) {
              ans[index] = entry.getKey();
              count++;
              index++;
          }
      }
      for(int i=0; i<ans.length; i++) {
          nums[i] = ans[i];
      }
  }
}