class Solution {
  public char findTheDifference(String s, String t) {
      StringBuilder ans = new StringBuilder(t);
      for (int i = 0; i < s.length(); i++) {
          int deleteIndex = ans.indexOf(Character.toString(s.charAt(i)));
          ans.deleteCharAt(deleteIndex);
      }
      return ans.charAt(0);
  }
}