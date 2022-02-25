class Solution {
  public String longestPalindrome(String s) {
      if (s.length() == 1) return s;
      int max = 0;
      String ans = "";
      
      for (int i = 0; i < s.length(); i++) {
          for (int j = s.length() - 1; j > i && max <= j - 1; j--) {
              String sub = s.substring(i, j + 1);
              boolean isPal = isPalindrome(sub);
              
              if (isPal) {
                  if (max < sub.length()) {
                      max = sub.length();
                      ans = sub;
                  }
                  break;
              }
          }
      }
      if (ans.equals("")) ans = Character.toString(s.charAt(0));
      return ans;
  }
  private static boolean isPalindrome(String s) {
      int start = 0;
      int end = s.length() - 1;
      
      while (start < end) {
          if (s.charAt(start++) != s.charAt(end--)) {
              return false;
          }
          if (start == end) {
              if (s.charAt(start) != s.charAt(end)) {
                  return false;
              }
          }
      }
      
      return true;
  }
}
