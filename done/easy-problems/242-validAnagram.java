class Solution {
  public boolean isAnagram(String s, String t) {
      Map<Character, Integer> charMap = new HashMap<>();
      for (int i = 0; i < s.length(); i++) {
          char newChar = s.charAt(i);
          if (charMap.containsKey(newChar)) {
              charMap.put(newChar, charMap.get(newChar) + 1);
          } else {
              charMap.put(newChar, 1);
          }
      }
      
      for (int i = 0; i < t.length(); i++) {
          char compareChar = t.charAt(i);
          if (charMap.containsKey(compareChar) && (charMap.get(compareChar) > 0)) {
              charMap.put(compareChar, charMap.get(compareChar) - 1);
          } else {
              return false;
          }
      }
      
      for (Map.Entry<Character, Integer> entry: charMap.entrySet()) {
          if (entry.getValue() > 0) return false;
      }
      return true;
  }
}