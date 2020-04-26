class Solution {
  public int numJewelsInStones(String J, String S) {
      Character[] jewels = new Character[J.length()];
      Map<Character, Integer> myStones = new HashMap<>();
      for (int i = 0; i < J.length(); i++) {
          jewels[i] = J.charAt(i);
      }
      for (int i = 0; i < S.length(); i++) {
          if (myStones.containsKey(S.charAt(i))) {
              myStones.put(S.charAt(i), myStones.get(S.charAt(i)) + 1);
          } else {
              myStones.put(S.charAt(i), 1);
          }
      }
      int ans = 0;
      for (int i = 0; i < jewels.length; i++) {
          if (myStones.containsKey(jewels[i])) {
              ans += myStones.get(jewels[i]);
          }
      }
      return ans;
  }
}