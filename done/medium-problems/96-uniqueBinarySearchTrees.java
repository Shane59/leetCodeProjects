class Solution {
  Integer[] cache;
  public int numTrees(int n) {
      cache = new Integer[n + 1];
      return totalNum(n);
  }
  
  private int totalNum(int n) {
      // base case
      if (n < 2) return 1;
      
      // check cache
      if (cache[n] != null) {
          return cache[n];
      }
      int total = 0;
      
      for (int i = 1; i <= n; i++) {
          int rightNum = n - i;
          int rightTotal = totalNum(rightNum);
          int leftNum = i - 1;
          int leftTotal = totalNum(leftNum);
          total += (leftTotal * rightTotal);
      }
      
      cache[n] = total;
      return cache[n];
  }
}