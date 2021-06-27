class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
      findCombination(0, candidates, target, temp, 0, ans);
      return ans;
  }
  private static void findCombination(int start, int[] candidates, int target, List<Integer> currentList, int sum, List<List<Integer>> ans) {
      if (sum == target) {
          List<Integer> temp = new ArrayList<>();
          for (Integer i: currentList) {
              temp.add(i);
          }
          ans.add(temp);
      }
      if (sum > target) return;
      for (int i = start; i < candidates.length; i++) {
          sum += candidates[i];
          currentList.add(candidates[i]);
          findCombination(start, candidates, target, currentList, sum, ans);
          sum -= candidates[i];
          currentList.remove(currentList.size() - 1);
          start++;
      }
  }
}