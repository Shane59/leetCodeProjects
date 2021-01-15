/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
  public static Map<Integer, Employee> empMap = new HashMap<>();
  
  public int getImportance(List<Employee> employees, int id) {
      for (int i = 0; i < employees.size(); i++) {
          empMap.put(employees.get(i).id, employees.get(i));
      }
      int[] sum = new int[1];
      getImportance(id, sum);
      
      return sum[0];
  }
  
  public void getImportance(int id, int[] sum) {
      List<Integer> sub = empMap.get(id).subordinates;
      
      sum[0] += empMap.get(id).importance;
      
      if (empMap.get(id).subordinates.size() == 0) {
          return;
      }
      
      for (int i = 0; i < sub.size(); i++) {
          getImportance(sub.get(i), sum);
      }
      
  }
}