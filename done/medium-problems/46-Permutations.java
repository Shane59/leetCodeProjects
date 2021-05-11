class Solution {
  public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> answer = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
      List<Integer> numsList = new ArrayList<>();
      for (int num: nums) {
          numsList.add(num);
      }
      executePermutation(numsList, temp, answer);
      return answer;
  }
  
  public void executePermutation(List<Integer> nums, List<Integer> temp, List<List<Integer>> ans) {
      if (nums.size() == 0) {
          List<Integer> newPerm = new ArrayList<>();
          for (int i = 0; i < temp.size(); i++) {
              newPerm.add(temp.get(i));
          }
          ans.add(newPerm);
      }
      for (int i = 0; i < nums.size(); i++) {
          List<Integer> newNums = new ArrayList<>();
          for (Integer el: nums) {
              newNums.add(el);
          }
          newNums.remove(i);
          temp.add(nums.get(i));
          executePermutation(newNums, temp, ans);
          temp.remove(temp.size() - 1);
      }
      
  }
}