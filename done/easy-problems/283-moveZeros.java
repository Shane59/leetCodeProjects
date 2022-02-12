class Solution {
    public void moveZeroes(int[] nums) {
        int base = 0;
        int i = 0;
        
        while (base < nums.length) {
            if (i < nums.length) {
                if (nums[i] == 0) {
                    i++;
                } else {
                    int temp = nums[base];
                    nums[base++] = nums[i++];
                }
            } else {
                nums[base++] = 0;
            }
        }
    }
}
