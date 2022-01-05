class Solution {
  public boolean isValid(String s) {
      Stack<Character> openCharStack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
          Character temp = s.charAt(i);
          switch (temp) {
              case '(':
              case '{':
              case '[':
                  openCharStack.push(temp);
                  break;
              case ')':
                  if (openCharStack.size() == 0) return false;
                  Character temp2 = openCharStack.pop();
                  if ('(' != temp2) {
                      return false;
                  }
                  break;
              case '}':
                  if (openCharStack.size() == 0) return false;
                  Character temp3 = openCharStack.pop();
                  if ('{' != temp3) {
                      return false;
                  }
                  break;
              case ']':
                  if (openCharStack.size() == 0) return false;
                  Character temp4 = openCharStack.pop();
                  if ('[' != temp4) {
                      return false;
                  }
                  break;
              default:
                  // nothing
          }
      }
      if (openCharStack.size() > 0) return false;
      return true;
  }
}
