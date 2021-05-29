class Solution {
  public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
      List<Integer> availableList = new ArrayList<>();
      for (int item: nums) {
          availableList.add(item);
      }
      ans.add(new ArrayList<Integer>());
      getAllSubsets(ans, temp, availableList);
      return ans;
  }
  
  public void getAllSubsets(List<List<Integer>> ans, List<Integer> temp, List<Integer> availableList) {
      // baseCase
      if (availableList.size() == 0) {
          return;
      }
      for (int i = 0; i < availableList.size(); i++) {
          int item = availableList.get(i);
          temp.add(item);
          
          List<Integer> addNewItem = new ArrayList<>();
          for (Integer tempItem: temp) {
              addNewItem.add(tempItem);
          }
          ans.add(addNewItem);
          
          List<Integer> newAvaialbeList = new ArrayList<>();
          for (int j = i + 1; j < availableList.size(); j++) {
              newAvaialbeList.add(availableList.get(j));
          }
          getAllSubsets(ans, temp, newAvaialbeList);
          temp.remove(temp.size() - 1);
      }
  }
}