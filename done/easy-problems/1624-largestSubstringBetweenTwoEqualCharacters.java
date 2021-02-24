class Solution {
  public int maxLengthBetweenEqualCharacters(String s) {
      int longestSub = -1;
      for (int i = 0; i < s.length(); i++) {
          String el = s.substring(i, i + 1);
          int lastOccurIndex = s.lastIndexOf(el);
          if (lastOccurIndex != i) {
              longestSub = Math.max(longestSub, lastOccurIndex - i - 1);
          }
      }
      return longestSub;
  }
}