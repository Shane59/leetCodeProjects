class Solution {
  public int arrangeCoins(int n) {
      if (n == 1 || n == 0) return n;
      int i = 1;
      while (n > 0) {
          n -= i;
          i++;
      }
      if (n == 0) return i - 1;
      return i - 2;
  }
}