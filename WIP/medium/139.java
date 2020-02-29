class Solution {
  public boolean wordBreak(String s, List<String> wordDict) {
      boolean found = false;
      int index = 0;
      String original = s;
      while(s.length() > 0) {
          if(index >= wordDict.size()) return false;
          for(int i=index, j=0; i<wordDict.size(); i++, j++) {
              if(containsWord(s, wordDict.get(i))) {
                  s = s.substring(wordDict.get(i).length(), s.length());
                  found = true;
                  if(s.length() == 0) return true;
                  break;
              }
              if(i == wordDict.size()-1 && s.length() > 0) {
                  found = false;
              }
          }
          if(!found && index < wordDict.size()) {
              index++;
              s = original;
          }
      }
      return false;
  }
      
  public boolean containsWord(String wholeString, String dictWord) {
      int wordLength = dictWord.length();
      if(wholeString.length() < dictWord.length()) {
          return false;
      }
      else {
          String checkWord = wholeString.substring(0, dictWord.length());
          if(checkWord.equals(dictWord)) return true;
      }
      return false;
  }
}