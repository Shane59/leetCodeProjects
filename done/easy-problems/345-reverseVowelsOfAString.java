class Solution {
  public String reverseVowels(String s) {
      List<Integer> indeciesOfVowels = new ArrayList<>();
      List<Character> vowels = new ArrayList<>();
      
      for (int i = 0; i < s.length(); i++) {
          if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e'
              || Character.toLowerCase(s.charAt(i)) == 'i'
              || Character.toLowerCase(s.charAt(i)) == 'o' || Character.toLowerCase(s.charAt(i)) == 'u') {
              vowels.add(s.charAt(i));
              indeciesOfVowels.add(i);
          }
      }
      
      if (indeciesOfVowels.size() <= 0) return s;
      
      int index = 0;
      int vowelsIndex = vowels.size() - 1;
      StringBuilder ans = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
          // if the i matches with index
          if (index < indeciesOfVowels.size() && i == indeciesOfVowels.get(index)) {
              ans.append(vowels.get(vowelsIndex--));
              index++;
          } else {
              ans.append(String.valueOf(s.charAt(i)));
          }
      }
      return ans.toString();
  }
}