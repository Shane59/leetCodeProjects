class Solution {
  public int[] shortestToChar(String S, char C) {
      int[] ans = new int[S.length()];
      for(int i = 0; i < S.length(); i++) {
          int right = findRightDistance(S, C, i);
          int left = findleftDistance(S, C, i);
          if(left == -1 || (right < left && right != -1)) {
              ans[i] = right;
          }
          else {
              ans[i] = left;
          }
      }
      return ans;
  }
  public int findRightDistance(String S, char c, int index) {
      int ans = 0;
      if(S.charAt(index) == c) {
          return 0;
      }
      else{
          index++;
          while(index < S.length()) {
              ans++;
              if(S.charAt(index) == c) {
                  return ans;
              }
              index++;
          }
      }
      return -1;
  }
  public int findleftDistance(String S, char c, int index) {
      int ans = 0;
      if(S.charAt(index) == c) {
          return ans;
      }
      else{
          index--;
          while(index >= 0) {
              ans++;
              if(S.charAt(index) == c) {
                  return ans;
              }
              index--;
          }
      }
      return -1;
  }
}