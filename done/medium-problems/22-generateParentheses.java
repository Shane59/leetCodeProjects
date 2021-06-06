class Solution {
  public List<String> generateParenthesis(int n) {
      List<String> ans = new ArrayList<>();
      recursion(ans, "", n, 0, 0);
      return ans;
  }
  
  public void recursion(List<String> ans, String temp, int max, int left, int right) {
      if (temp.length() == max * 2) {
          ans.add(temp);
          return;
      }
      if (left < max) {
          recursion(ans, temp + "(", max, left + 1, right);
      } 
      if (right < left) {
          recursion(ans, temp + ")", max, left, right + 1);
      }
      
  }
}