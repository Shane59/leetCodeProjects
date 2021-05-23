class Solution {
  public List<Integer> partitionLabels(String s) {
      int targetIndex = -1;
      List<Character> appearedCharList = new ArrayList<>();
      List<Integer> ans = new ArrayList<>();
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
          count++;
          char ch = s.charAt(i);
          if (appearedCharList.contains(ch) && targetIndex != i) {
              continue;
          }
          int index = s.lastIndexOf(ch);
          if (targetIndex == i || (index == i && targetIndex < index)) {
              ans.add(count);
              count = 0;
              targetIndex = -1;
              continue;
          }
          
          if (index > targetIndex) {
              appearedCharList.add(ch);
              targetIndex = index;
          }
      }
      return ans;
  }
}