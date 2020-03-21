import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> mapOfArr1 = new HashMap<>();
        List<Integer> newArray1 = new LinkedList<>();
        for(int i = 0; i < arr1.length; i++) {
            newArray1.add(arr1[i]);
        }
        for(int i = 0; i < arr1.length; i++) {
            if(mapOfArr1.containsKey(arr1[i])) {
                mapOfArr1.put(arr1[i], mapOfArr1.get(arr1[i]) + 1);
            }
            else {
                mapOfArr1.put(arr1[i], 1);
            }
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < mapOfArr1.get(arr2[i]); j++) {
                ans[index++] = arr2[i];
                newArray1.remove(newArray1.indexOf(arr2[i]));
            }
        }
        Collections.sort(newArray1);
        for(int i = 0; i < newArray1.size(); i++) {
            int startIndex = ans.length - newArray1.size() + i;
            ans[startIndex] = newArray1.get(i);
        }
        return ans;
    }
}