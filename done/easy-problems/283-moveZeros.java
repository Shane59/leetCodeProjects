class Solution {
  public void moveZeroes(int[] nums) {
      if(nums.length>1) {
          int last = nums.length-1;
          for(int i=0; i<nums.length;){
              if(nums[i]==0) {
                  int index = i;
                  while(index+1<nums.length){
                      int temp = nums[index+1];
                      nums[index] = temp;
                      index++;
                  }
                  nums[index] = 0;
                  last--;
              }
          if(nums[i] != 0) i++;
          if(i >= last) break;
          }
      } 
  }
}