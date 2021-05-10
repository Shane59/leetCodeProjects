class Solution {
  private int[] list;

  public Solution(int[] nums) {
      int[] temp = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
          temp[i] = nums[i];
      }
      list = temp;
  }
  
  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
      return list;
  }
  
  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
      Integer[] temp = new Integer[list.length];
      for (int i = 0; i < list.length; i++) {
          temp[i] = list[i];
      }
      
      List<Integer> arrayList = Arrays.asList(temp);
      Collections.shuffle(arrayList);
      
      int[] reformInt = new int[list.length];
      for (int i = 0; i < list.length; i++) {
          reformInt[i] = arrayList.get(i);
      }
      
      return reformInt;
  }
}

/**
* Your Solution object will be instantiated and called as such:
* Solution obj = new Solution(nums);
* int[] param_1 = obj.reset();
* int[] param_2 = obj.shuffle();
*/