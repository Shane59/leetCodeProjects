class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans = new ArrayList<>();
      List<String> group = new ArrayList<>();
      
      for (int i = 0; i < strs.length; i++) {
          int inGroup = isGroup(strs[i], group);
          if (inGroup >= 0) {
              List<String> temp = ans.get(inGroup);
              List<String> newList = new ArrayList<>();
              
              for (String str: temp) {
                  newList.add(str);
              }
              newList.add(strs[i]);
              ans.remove(inGroup);
              ans.add(inGroup, newList);
              
          } else {
              group.add(strs[i]);
              ans.add(Arrays.asList(strs[i]));
          }
      }
      
      
      
      return ans;
  }
  
  public static int isGroup(String str, List<String> group) {
      if (group.size() < 0) return -1;
      for (int i = 0; i < group.size(); i++) {
          String temp = group.get(i);
          if (str.equals(temp)) {
              return i;
          }
          if (str.length() != temp.length()) {
              continue;
          }
          for (int j = 0; j < str.length(); j++) {
              char c = str.charAt(j);
              int index = temp.indexOf(c);
              if (index < 0) {
                  break;
              } else {
                  temp = temp.substring(0, index) + temp.substring(index + 1);
              }
              if (temp.length() == 0) {
                  return i;
              }
          }
      }
      return -1;
  }
}
