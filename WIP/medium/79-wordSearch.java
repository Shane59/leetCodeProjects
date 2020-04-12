class Solution {
  public boolean exist(char[][] board, String word) {
    // creating map of letters' availability
    Map<Character, Integer> lettersAvailability = new HashMap<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (lettersAvailability.containsKey(board[i][j])) {
          lettersAvailability.put(board[i][j],
            lettersAvailability.get(board[i][j]) + 1);
        } else {
          lettersAvailability.put(board[i][j], 1);
        }
      }
    }
    System.out.println(lettersAvailability);
    for(int i = 0; i < word.length(); i++) {
      char search = word.charAt(i);
      boolean found = findLetter(lettersAvailability, search);
      if (found == false) return false;
    }
    return true;
  }
  public boolean findLetter(Map<Character, Integer> availability, char search) {
    if (availability.containsKey(search) && availability.get(search) > 0) {
      updateMap(availability, search);
      return true;
    } else {
      return false;
    }
  }
  public Map<Character, Integer> updateMap(Map<Character, Integer> map, char key) {
    map.put(key, map.get(key) - 1);
    return map;
  }
}