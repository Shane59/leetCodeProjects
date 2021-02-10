class Solution {
  public int countSegments(String s) {
      if (s.length() == 0) return 0;
      String[] splittedString = s.split(" ");
      System.out.println(Arrays.toString(splittedString));
      int count = 0;
      if (splittedString.length > 0) {
          for (int i = 0; i < splittedString.length; i++) {
              if (splittedString[i].length() > 0) {
                  count++;
              }
          }
      }
      return count;
  }
}