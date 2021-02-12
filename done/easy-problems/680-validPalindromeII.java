class Solution {
  public boolean validPalindrome(String s) {
      int start = 0;
      int end = s.length() - 1;
      int count = 0;
      boolean left = true;
      boolean right = true;
      List<Character> charList = new ArrayList<>();
      
      for (char element: s.toCharArray()) {
          charList.add(element);
      }
      
      while (start < end) {
          if (charList.get(start) != charList.get(end)) {
              if (count > 0) {
                  right = false;
                  break;
              }
              end--;
              count++;
          } else {
              end--;
              start++;
          }
      }
      
      start = 0;
      end = s.length() - 1;
      count = 0;
      
      while (start < end) {
          if (charList.get(start) != charList.get(end)) {
              if (count > 0) {
                  left = false;
                  break;
              }
              start++;
              count++;
          } else {
              end--;
              start++;
          }
      }
      return left || right;
  }
}