class Solution {
  public boolean uniqueOccurrences(int[] arr) {
      Map<Integer, Integer> numOfOccurrencesMap = new HashMap<>();
      
      for (int i = 0; i < arr.length; i++) {
          if (numOfOccurrencesMap.containsKey(arr[i])) {
              numOfOccurrencesMap.put(arr[i], numOfOccurrencesMap.get(arr[i]) + 1);
          } else {
              numOfOccurrencesMap.put(arr[i], 1);
          }
      }
      
      List<Integer> numOfOccurrencesList = new ArrayList<>();
      for (Map.Entry<Integer, Integer> entry: numOfOccurrencesMap.entrySet()) {
          numOfOccurrencesList.add(entry.getValue());
      }
      
      while (numOfOccurrencesList.size() > 0) {
          int check = numOfOccurrencesList.remove(0);
          if (numOfOccurrencesList.contains(check)) return false;
      }
      return true;
  }
}