class Solution {
  public int findKthPositive(int[] arr, int k) {
      List<Integer> missingNumbersList = new ArrayList<>();
      int j = 0;
      for (int i = 1; i <= arr[arr.length - 1]; i++) {
          if (i != arr[j]) {
              missingNumbersList.add(i);
          } else {
              j++;
          }
      }
      if (missingNumbersList.size() == 0 || missingNumbersList.size() < k) {
          int lastDigit = arr[arr.length - 1];
          int count = 0;
          while (count != k - missingNumbersList.size()) {
              lastDigit++;
              count++;
          }
          return lastDigit;
      }
      return missingNumbersList.get(k - 1);
  }
}