class Solution {
  public boolean isSubsequence(String s, String t) {
      if (s.length() == 0 && t.length() == 0) return true;
      if (t.length() == 0) return false;
      int j = 0;
      for(int i = 0; i < s.length(); i++) {
          if (j >= t.length()) return false;
          char element = s.charAt(i);
          for (; j < t.length(); j++) {
              char compare = t.charAt(j);
              if (element == compare) {
                  j++;
                  break;
              }
              if (j == t.length() - 1) return false;
          }
      }
      return true;
  }
}