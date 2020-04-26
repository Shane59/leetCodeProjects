class Solution {
  public int findLucky(int[] arr) {
      Map<Integer, Integer> frequencyOfNum = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
          if (frequencyOfNum.containsKey(arr[i])) {
              frequencyOfNum.put(arr[i], frequencyOfNum.get(arr[i]) + 1);
          } else {
              frequencyOfNum.put(arr[i], 1);
          }
      }
      int[] ans = new int[frequencyOfNum.size()];
      int index = 0;
      boolean passed = false;
      for (Map.Entry<Integer, Integer> entry: frequencyOfNum.entrySet()) {
          if (entry.getKey() == entry.getValue()) {
              ans[index++] = entry.getKey();
              passed = true;
          }
      }
      int maxNum = ans[0];
      if (!passed) return -1;
      if (ans.length > 1) {
          for (int i = 1; i < ans.length; i++) {
              if (ans[i] > maxNum) {
                  maxNum = ans[i];
              }
          }
      }
      else {
          return ans[0];
      }
      return maxNum;
  }
}