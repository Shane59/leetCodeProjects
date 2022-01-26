class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        
        int prev = nums[0];
        int count = 1;
        int half = nums.length / 2;
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) {
                count++;
                if (count > half) return nums[i];
            } else {
                count = 1;
            }
            prev = nums[i];
            
        }
        return -1;
    }
}
