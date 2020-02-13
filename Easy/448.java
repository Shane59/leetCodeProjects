class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
      Set<Integer> numList = new HashSet<Integer>();
      List<Integer> ans = new LinkedList<Integer>();
      for(int element: nums) {
          numList.add(element);
      }
      for(int i = 1; i <= nums.length; i++) {
          if(!numList.contains(i)) {
              ans.add(i);
          }
      }
      return ans;
  }
}