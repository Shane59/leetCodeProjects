class Solution {
  public boolean isPerfectSquare(int num) {
      for (long i = 1; i * i <= num;) {
          if (i * i == num) return true;
          i++;
      }
      return false;
  }
}