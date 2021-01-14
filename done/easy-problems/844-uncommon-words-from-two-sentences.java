class Solution {
  public String[] uncommonFromSentences(String A, String B) {
      Map<String, Integer> stringMapA = new HashMap<>();
      Map<String, Integer> stringMapB = new HashMap<>();
      
      String[] stringListA = A.split(" ");
      String[] stringListB = B.split(" ");
      
      for (int i = 0; i < stringListA.length; i++) {
          if (stringMapA.containsKey(stringListA[i])) {
              stringMapA.put(stringListA[i], stringMapA.get(stringListA[i]) + 1);
          } else {
              stringMapA.put(stringListA[i], 1);
          }
      }
      
      for (int i = 0; i < stringListB.length; i++) {
          if (stringMapB.containsKey(stringListB[i])) {
              stringMapB.put(stringListB[i], stringMapB.get(stringListB[i]) + 1);
          } else {
              stringMapB.put(stringListB[i], 1);
          }
      }
      
      List<String> tempAns = new ArrayList<>();
      
      for (Map.Entry<String, Integer> entry: stringMapA.entrySet()) {
          if (!stringMapB.containsKey(entry.getKey()) && entry.getValue() < 2) {
              tempAns.add(entry.getKey());
          }
      }
      
      for (Map.Entry<String, Integer> entry: stringMapB.entrySet()) {
          if (!stringMapA.containsKey(entry.getKey()) && entry.getValue() < 2) {
              tempAns.add(entry.getKey());
          }
      }
      
      return listToArray(tempAns);
  }
  
  public static String[] listToArray(List<String> l) {
      int size = l.size();
      String[] newArray = new String[size];
      
      for (int i = 0; i < size; i++) {
          newArray[i] = l.get(i);
      }
      
      return newArray;
  }
}