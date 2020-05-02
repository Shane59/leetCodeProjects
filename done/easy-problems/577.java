class Solution {
  public String reverseWords(String s) {
      String[] wordsList = s.split(" ");
      String ans = "";
      for (int i = 0; i < wordsList.length; i++) {
          for (int j = wordsList[i].length(); j > 0; j--) {
              ans += wordsList[i].substring(j - 1, j);
          }
          if (i != wordsList.length - 1) {
              ans += " ";
          }
      }
      return ans;
  }
}
