/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
  public int guessNumber(int n) {
      int start = 1;
      int end = n;
      int middle;
      int result;
      while (start <= end) {
          middle = start + (end - start) / 2;
          result = guess(middle);
          if (result == 0) {
              return middle;
          }
          if (result == -1) {
              System.out.println("lower" + middle);
              end = middle - 1;
          } else {
              System.out.println("higher" + middle);
              start = middle + 1;
          }
      }
      return 0;
  }
}