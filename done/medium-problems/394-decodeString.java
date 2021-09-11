class Solution {
  public String decodeString(String s) {
      Stack<Integer> countStack = new Stack<>();
      Stack<String> stringStack = new Stack<>();
      String res = "";
      
      for (int i = 0; i < s.length(); i++) {
          if (Character.isDigit(s.charAt(i))) {
              int count = 0;
              while (Character.isDigit(s.charAt(i))) {
                  count = 10 * count + s.charAt(i) - '0';
                  i += 1;
              }
              i -= 1;
              countStack.push(count);
              
          } else if (s.charAt(i) == '[') {
              stringStack.push(res.toString());
              res = "";
          } else if (s.charAt(i) == ']') {
              StringBuilder temp2 = new StringBuilder(stringStack.pop());
              int count = countStack.pop();
              for (int k = 0; k < count; k++) {
                  temp2.append(res);
              }
              res = temp2.toString();
              
              
          } else {
              res += s.charAt(i); 
          }
          
          
      }
      
      return res;
  }
}