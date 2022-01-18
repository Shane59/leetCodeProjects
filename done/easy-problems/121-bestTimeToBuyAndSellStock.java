class Solution {
  public int maxProfit(int[] prices) {
      if (prices.length == 1) {
          return 0;
      }
      int[] small = new int[prices.length];
      int[] big = new int[prices.length];
      
      small[0] = prices[0];
      big[prices.length - 1] = prices[prices.length - 1];
      
      for (int i = 1; i < prices.length; i++) {
          if (prices[i] < small[i - 1]) {
              small[i] = prices[i];
          } else {
              small[i] = small[i - 1];
          }
      }
      
      for (int i = prices.length - 2; i > 0; i--) {
          if (prices[i] > big[i + 1]) {
              big[i] = prices[i];
          } else {
              big[i] = big[i + 1];
          }
      }
      
      int max = 0;
      for (int i = 0; i < prices.length; i++) {
          int sub = big[i] - small[i];
          if (sub > max) {
              max = sub;
          }
      }
      
      return max;
  }
}
