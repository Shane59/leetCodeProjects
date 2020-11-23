class Solution {
  public boolean isPalindrome(String s) {
      int count = 0;
      
      for (int i = 0; i < s.length(); i++) {
          if (s.substring(i, i + 1).matches("[a-zA-Z0-9]+")) {
              count++;
          }
      }
      char[] charList = new char[count];
      int index = 0;
      
      for (int i = 0; i < s.length(); i++) {
          if (s.substring(i, i + 1).matches("[a-zA-Z0-9]+")) {
              char newChar = s.charAt(i);
              charList[index++] = Character.toUpperCase(newChar);
          }
      }
      int start = 0;
      int end = count - 1;
      while (start < end) {
          if (charList[start++] != charList[end--]) {
              return false;
          }
      }
      return true;
  }
}