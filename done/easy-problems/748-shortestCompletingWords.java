class Solution {
  Map<Character, Integer> wordsMap = new HashMap<>();
  
  public String shortestCompletingWord(String licensePlate, String[] words) {
      for (int i = 0; i < licensePlate.length(); i++) {
          Character element = Character.toLowerCase(licensePlate.charAt(i));
          if (Character.isLetter(element)) {
              if (wordsMap.containsKey(element)) {
                  wordsMap.put(element, wordsMap.get(element) + 1);
              } else {
                  wordsMap.put(element, 1);
              }
          }
      }
      int minLen = Integer.MIN_VALUE;
      String minString = "";
      for (int i = 0; i < words.length; i++) {
          if (isComplete(words[i])) {
              if (minString.equals("")) {
                  minString = words[i];
                  minLen = words[i].length();
              } else if (minLen > words[i].length()) {
                  minLen = words[i].length();
                  minString = words[i];
              }
          }
      }
      return minString;
  }
  
  public boolean isComplete(String s) {
      Map<Character, Integer> temp = new HashMap<>(wordsMap);
      for (int i = 0; i < s.length(); i++) {
          char element = Character.toLowerCase(s.charAt(i));
          if (temp.containsKey(element) && temp.get(element) != 0) {
              temp.put(element, temp.get(element) - 1);
          }
      }
      
      for (Map.Entry<Character, Integer> entry: temp.entrySet()) {
          if (entry.getValue() > 0) return false;
      }
      return true;
  }
}