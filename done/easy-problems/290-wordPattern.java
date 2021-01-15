class Solution {
  public boolean wordPattern(String pattern, String s) {
      //convert string to arraylist
      String[] newString = s.split(" ");
      if (pattern.length() != newString.length) return false;
      //create hashMap
      Map<Character, String> patternMap = new HashMap<>();
      
      //iterating both at the same time
      for (int i = 0; i < pattern.length(); i++) {
          char patternChar = pattern.charAt(i);
          String word = newString[i];
          
          if (patternMap.containsKey(patternChar)) {
              //check if the value is the same
              if (!patternMap.get(patternChar).equals(word)) {
                  return false;
              }
          } else {
              //check if the value already exist
              if (patternMap.containsValue(word)) {
                  return false;
              } else {
                  patternMap.put(patternChar, word);
              }
          }
      }
      return true;
  }
}