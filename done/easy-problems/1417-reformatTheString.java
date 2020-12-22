class Solution {
  public String reformat(String s) {
      List<Character> intList = new ArrayList<>();
      List<Character> letterList = new ArrayList<>();
      StringBuilder ans = new StringBuilder();
      
      for (int i = 0; i < s.length(); i++) {
          if (Character.isDigit(s.charAt(i))) {
              intList.add(s.charAt(i));
          } else {
              letterList.add(s.charAt(i));
          }
      }
      int startIntList = 0;
      int startLetterList = 0;
      char lastChar = '/';
      
      // add the first letter
      if (letterList.size() != 0 && intList.size() > letterList.size()) {
          lastChar = intList.get(startIntList);
          ans.append(intList.get(startIntList++));
      } else if (intList.size() != 0 && intList.size() < letterList.size()) {
          lastChar = letterList.get(startLetterList);
          ans.append(letterList.get(startLetterList++));
      }
      
      while(startIntList < intList.size() && startLetterList < letterList.size()) {
          if (Character.isDigit(lastChar)) {
              lastChar = letterList.get(startLetterList);
              ans.append(letterList.get(startLetterList++));
          } else {
              System.out.println(lastChar);
              lastChar = intList.get(startIntList);
              ans.append(intList.get(startIntList++));
          }
      }
      
      // add the rest
      if (intList.size() - startIntList == 1 ) {
          ans.append(intList.get(startIntList++));
      } else if (letterList.size() - startLetterList == 1) {
          ans.append(letterList.get(startLetterList++));
      }
      return ans.toString();
  }
}