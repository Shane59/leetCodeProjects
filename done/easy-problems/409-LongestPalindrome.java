class Solution {
  public int longestPalindrome(String s) {
      Map<Character, Integer> charMap = new HashMap<>();
      
      for (int i = 0; i < s.length(); i++) {
          if (charMap.containsKey(s.charAt(i))) {
              charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
          } else {
              charMap.put(s.charAt(i), 1);
          }
      }
      
      int count = 0;
      boolean stillPal = true;
      while (stillPal){
          stillPal = false;
          for (Map.Entry<Character, Integer> entry: charMap.entrySet()) {
              if (entry.getValue() > 1) {
                  count += 2;
                  charMap.put(entry.getKey(), entry.getValue() - 2);
                  stillPal = true;
              }
          }
      }
      
      for (Map.Entry<Character, Integer> entry: charMap.entrySet()) {
              if (entry.getValue() > 0) {
                  count++;
                  break;
              }
          }
      return count;
  }
}