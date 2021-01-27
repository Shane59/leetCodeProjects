class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
      if (magazine.length() < ransomNote.length()) return false;
      
      StringBuilder ransomNoteBuilder = new StringBuilder(ransomNote);
      StringBuilder magazineBuilder = new StringBuilder(magazine);
      
      while (ransomNoteBuilder.length() > 0) {
          char element = ransomNoteBuilder.charAt(0);
          if (magazineBuilder.indexOf(Character.toString(element)) != -1) {
              ransomNoteBuilder.deleteCharAt(0);
              magazineBuilder.deleteCharAt(magazineBuilder.indexOf(Character.toString(element)));
          } else {
              return false;
          }
      }
      return true;
  }
}