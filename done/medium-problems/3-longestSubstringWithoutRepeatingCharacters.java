import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        List<Character> charList = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (charList.contains(temp)) {
                int index = charList.indexOf(temp);
                max = Math.max(charList.size(), max);
                charList.subList(0, index + 1).clear();
                
            }
            charList.add(temp);
        }
        max = Math.max(charList.size(), max);
        return max;
    }
}
