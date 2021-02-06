class Solution {
  public String addStrings(String num1, String num2) {
      char[] num1Char;
      char[] num2Char;
      StringBuilder answer = new StringBuilder();
    if (num1.length() > num2.length()) {
          num1Char = new char[num1.length()];
          num2Char = new char[num1.length()];
      } else {
          num1Char = new char[num2.length()];
          num2Char = new char[num2.length()];
      }
      
      for (int i = num1Char.length - 1; i >= 0; i--) {
          if (num1.length() < 1) {
              num1Char[i] = '0';
          } else {
              char numChar = num1.charAt(num1.length() - 1);
              num1Char[i] = numChar;
              num1 = num1.substring(0, num1.length() - 1);
          }
      }
      
      for (int i = num2Char.length - 1; i >= 0; i--) {
          if (num2.length() < 1) {
              num2Char[i] = '0';
          } else {
              char numChar = num2.charAt(num2.length() - 1);
              num2Char[i] = numChar;
              num2 = num2.substring(0, num2.length() - 1);
          }
      }
      int carry = 0;
      for (int i = num1Char.length - 1; i >= 0; i--) {
          int sum = Character.getNumericValue(num1Char[i]) + Character.getNumericValue(num2Char[i]);
          sum += carry;
          answer.insert(0, sum % 10);
          carry = sum / 10;
      }
      if (carry > 0) answer.insert(0, carry);
      return answer.toString();
  }
}