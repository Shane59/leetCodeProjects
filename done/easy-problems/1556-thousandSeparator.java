class Solution {
  public String thousandSeparator(int n) {
      StringBuilder ans = new StringBuilder();
      int level = 1;
      if (n == 0) return "0";
      
      while (n > 0) {
          String num = String.valueOf(n % 10);
          n = n / 10;
          if (level % 4 == 0) {
              ans.insert(0, ".");
              level = 1;
          }
          ans.insert(0, num);
          level++;
      }
      return ans.toString();
  }
}