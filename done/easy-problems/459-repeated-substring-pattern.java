class Solution {
  public boolean repeatedSubstringPattern(String s) {
      int i = 1;
      StringBuilder text = new StringBuilder(s);
      boolean inDeletion = false;
      String checkSub = "";
      
      while (i <= text.length() && text.length() > 0) {
          if (inDeletion) {
              String sub = text.substring(0, i);
              if (sub.equals(checkSub)) {
                  text.delete(0, i);
              } else {
                  text = new StringBuilder(s);
                  inDeletion = false;
                  i++;
              }
          } else {
              if (i == text.length()) return false;
              String sub = text.substring(0, i);
              text.delete(0, i);
              if (text.length() >= i) {
                  checkSub = text.substring(0, i);
                  if (sub.equals(checkSub)) {
                      text.delete(0, i);
                      inDeletion = true;
                  } else {
                      text = new StringBuilder(s);
                      inDeletion = false;
                      i++;
                  }
              } else {
                  return false;
              }
          }
          
      }
      if (text.length() == 0) return true;
      return false;
  }
}