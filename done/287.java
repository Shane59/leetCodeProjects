class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        //generate a map
        for(int i=0; i<nums.length; i++) {
            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], 2);
            }
            else {
              numsMap.put(nums[i], 1)  ;
            }
        }
        for(Map.Entry<Integer, Integer> key: numsMap.entrySet()) {
            if(key.getValue() == 2) {
                return key.getKey();
            }
        }
        return 0;
    }
}