class Solution {
  public int maximum69Number (int num) {
      int count = 0;
      int temp = num;
      int ans = 0;
      boolean found = false;
      
      while (temp / 10 > 0) {
          temp /= 10;
          count++;
      }
      
      while (count >= 0) {
          if (!found) {
              int times = (int)Math.pow(10, count);
              if (num / times == 6) {
                  int part = 9 * times;
                  ans += part;
                  found = true;
              } else {
                  ans += (num / times) * times;
                  count--;
              }
              num %= times;
          }
          else {
              ans += num;
              break;
          }
      }
      return ans;
  }
}