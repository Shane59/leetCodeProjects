class Solution {
  public String makeGood(String s) {
      boolean bad = true;
      
      while (bad) {
          bad = false;
          for (int i = 0; i < s.length() - 1; i++) {
              char first = s.charAt(i);
              char second = s.charAt(i + 1);
              if (first == Character.toUpperCase(second) && !Character.isUpperCase(second)) {
                  s = s.substring(0, i) + s.substring(i + 2, s.length());
                  bad = true;
                  break;
              } else if (Character.toUpperCase(first) == second && !Character.isUpperCase(first)) {
                  s = s.substring(0, i) + s.substring(i + 2, s.length());
                  bad = true;
                  break;
              }
          }
      }
      return s;
  }
}