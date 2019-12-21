//O(n^2)

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                if (i==s.length()) count++;
                else if(isPalidrome(s.substring(i, j))){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPalidrome(String s) {
        if(s.length()==1) return true;
        for(int i=0, j=s.length()-1; i<j; i++, j--) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}