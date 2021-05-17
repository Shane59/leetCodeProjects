class Solution {
  public List<String> letterCombinations(String digits) {
      //generate map
      List<List<String>> list = generateMap(digits);
      List<String> ans = new ArrayList<>();
      StringBuilder temp = new StringBuilder();
      if (digits.equals("")) {
          return ans;
      }
      doRecursion(list, ans, temp);
      return ans;
  }
  private void doRecursion(List<List<String>> phoneNumList, List<String> ans, StringBuilder temp) {
      if (phoneNumList.size() == 0) {
          ans.add(temp.toString());
      }
      for (int i = 0; phoneNumList.size() > 0 && i < phoneNumList.get(0).get(0).length(); i++) {
          // add the first element of available list
          temp.append(phoneNumList.get(0).get(0).substring(i,i+1));
          List<List<String>> newPhoneNumList = new ArrayList<>();
          for (List<String> list: phoneNumList) {
              newPhoneNumList.add(list);
          }
          newPhoneNumList.remove(0);
          doRecursion(newPhoneNumList, ans, temp); // for the next phoneNumList
          temp.deleteCharAt(temp.length() - 1);
      }
  }
  private List<List<String>> generateMap(String digits) {
      List<List<String>> phoneNumList = new ArrayList<>();
      for (int i = 0; i < digits.length(); i++) {
          switch(digits.charAt(i)) {
              case '2':
                  List<String> temp = new ArrayList<>();
                  temp.add("abc");
                  phoneNumList.add(temp);
                  break;
              case '3':
                  List<String> temp3 = new ArrayList<>();
                  temp3.add("def");
                  phoneNumList.add(temp3);
                  break;
              case '4':
                  List<String> temp4 = new ArrayList<>();
                  temp4.add("ghi");
                  phoneNumList.add(temp4);
                  break;
              case '5':
                  List<String> temp5 = new ArrayList<>();
                  temp5.add("jkl");
                  phoneNumList.add(temp5);
                  break;
              case '6':
                  List<String> temp6 = new ArrayList<>();
                  temp6.add("mno");
                  phoneNumList.add(temp6);
                  break;
              case '7':
                  List<String> temp7 = new ArrayList<>();
                  temp7.add("pqrs");
                  phoneNumList.add(temp7);
                  break;
              case '8':
                  List<String> temp8 = new ArrayList<>();
                  temp8.add("tuv");
                  phoneNumList.add(temp8);
                  break;
              case '9':
                  List<String> temp9 = new ArrayList<>();
                  temp9.add("wxyz");
                  phoneNumList.add(temp9);
                  break;
              default:
                  break;
          }   
      }
      return phoneNumList;
  }
}
