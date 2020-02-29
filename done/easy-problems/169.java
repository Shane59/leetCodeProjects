class Solution {
  public int majorityElement(int[] nums) {
      Map<Integer, Integer> countNum = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
          if(countNum.containsKey(nums[i])){
              countNum.put(nums[i], countNum.get(nums[i]) + 1);
          }
          else{
              countNum.put(nums[i], 1);
          }
      }
      int maxCount = 0;
      int ans = 0;
      for(Map.Entry<Integer, Integer> el: countNum.entrySet()) {
          if(el.getValue() > maxCount) {
              maxCount = el.getValue();
              ans = el.getKey();
          }
      }
      return ans;
  }
}