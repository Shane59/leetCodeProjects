class Solution {
  public boolean isUgly(int num) {
      if (num == 0) return false;
      int[] primeNumbers = {2,3,5};
      
      int index = primeNumbers.length - 1;
      while (index >= 0) {
          if (num % primeNumbers[index] == 0) {
              num /= primeNumbers[index];
          } else {
              index--;
          }
      }
      if (num == 1) return true;
      return false;
  }
}