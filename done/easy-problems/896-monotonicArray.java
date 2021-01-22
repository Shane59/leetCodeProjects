class Solution {
  public boolean isMonotonic(int[] A) {
      if (A.length == 0) return true;
      List<Integer> increaseList = new ArrayList<>();
      List<Integer> decreaseList = new ArrayList<>();
      String prevArray = "";
      int ignored = 0;
      
      int prevNum = A[0];
      increaseList.add(prevNum);
      decreaseList.add(prevNum);
      
      for (int i = 1; i < A.length; i++) {
          if (A[i] > prevNum) {
              increaseList.add(A[i]);
          } else if (A[i] < prevNum) {
              decreaseList.add(A[i]);
          } else {
              ignored++;
          }
          prevNum = A[i];
      }
      
      if ((increaseList.size() == A.length - ignored) || (decreaseList.size() == A.length - ignored)) {
          return true;
      }
      return false;
  }
}