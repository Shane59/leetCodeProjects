class Solution {
  public int firstUniqChar(String s) {
      Map<Character, Integer> charNum = new HashMap<>();
      for (int i = 0; i < s.length(); i++) {
          if (charNum.containsKey(s.charAt(i))) {
              charNum.put(s.charAt(i), charNum.get(s.charAt(i)) + 1);
          } else {
              charNum.put(s.charAt(i), 1);
          }
      }
      System.out.println(charNum);
      for (int i = 0; i < s.length(); i++) {
          if (charNum.get(s.charAt(i)) == 1) {
              return i;
          }
      }
      return -1;
  }
}
