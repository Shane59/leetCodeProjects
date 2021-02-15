class Solution {
  public boolean buddyStrings(String A, String B) {
      if (A.length() != B.length()) return false;
      if (A.length() <= 0 && B.length() <= 0) return false;
      
      char[] diffA = new char[2];
      char[] diffB = new char[2];
      Map<Character, Integer> charAMap = new HashMap<>();
      int index = 0;
      
      for (int i = 0; i < A.length(); i++) {
          if (charAMap.containsKey(A.charAt(i))) {
              charAMap.put(A.charAt(i), charAMap.get(A.charAt(i)) + 1);
          } else {
              charAMap.put(A.charAt(i), 1);
          }
          if (A.charAt(i) != B.charAt(i)) {
              if (index >= 2) return false;
              diffA[index] = A.charAt(i);
              diffB[index] = B.charAt(i);
              index++;
          }
      }
      if ((int)diffA[0] != 0 && (int)diffA[1] == 0) {
          return false;
      }
      
      // swap two in diffA
      char temp = diffA[0];
      diffA[0] = diffA[1];
      diffA[1] = temp;
      if ((int)diffA[0] == 0) {
          for (Map.Entry<Character, Integer> entry: charAMap.entrySet()) {
              if (entry.getValue() > 1) return true;
          }
          return false;
      } else {
          for (int i = 0; i < diffA.length; i++) {
              if (diffA[i] != diffB[i]) return false;
          }
      }
      return true;
  }
}