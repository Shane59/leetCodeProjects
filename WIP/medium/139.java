class Solution {
  public boolean wordBreak(String s, List<String> wordDict) {
      if(wordDict.size() == 0) return false;
      int index = 0;
      while(index<s.length()) {
          for(int i=0; i<wordDict.size(); i++) {
              int dictSize = wordDict.get(i).length();
              // String wordCheck = wordDict.get(i);
              if(s.length() < dictSize) {
                  return false;
              }
              else {
                  String substring = s.substring(0, dictSize);   
                  if (wordBreakHelper(substring, wordDict)) {
                      s = s.substring(dictSize, s.length());
                  if(s.length() == 0) return true;
                  }
              }
          }
          index++;
      }
      return false;
  }
  public boolean wordBreakHelper(String word, List<String> wordDict) {
      for(int i=0; i<wordDict.size(); i++) {
          int dictSize = wordDict.get(i).length();
          String wordCheck = wordDict.get(i);
          if(word.equals(wordCheck)) return true;
      }
      return false;
  }
}