class Solution {
  public int[] arrayRankTransform(int[] arr) {
      Map<Integer, Stack<Integer>> numMap = new HashMap<>();
      int[] ans = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
          if (numMap.containsKey(arr[i])) {
              Stack<Integer> temp = numMap.get(arr[i]);
              temp.add(i);
              numMap.put(arr[i], temp);
          } else {
              Stack<Integer> temp = new Stack<>();
              temp.add(i);
              numMap.put(arr[i], temp);
          }
      }
      
      Arrays.sort(arr);
      int prevNum = -9999;
      int rank = 1;
      
      for (int i = 0; i < arr.length; i++) {
          Stack<Integer> indexStack = numMap.get(arr[i]);
          int index = (int)indexStack.pop();
          if (prevNum == arr[i]) {
              ans[index] = --rank;
          } else {
              ans[index] = rank;
          }
          rank++;
          prevNum = arr[i];
      }
      
      return ans;
  }
}