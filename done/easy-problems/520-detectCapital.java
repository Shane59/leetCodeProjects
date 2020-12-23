class Solution {
  public boolean detectCapitalUse(String word) {
      boolean allCap = true;
      boolean allLowerCase = true;
      boolean firstCap = true;
      
      for (int i = 0; i < word.length(); i++) {
          boolean isCap = Character.isUpperCase(word.charAt(i));
          if (!isCap && i == 0) {
              allCap = false;
              firstCap = false;
          } else if (!isCap) {
              allCap = false;
          } else if (isCap && i > 0) {
              allLowerCase = false;
              firstCap = false;
          } else if (isCap) {
              allLowerCase = false;
          }
      }
      
      return allCap || allLowerCase || firstCap;
  }
}