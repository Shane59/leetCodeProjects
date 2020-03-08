/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public boolean isPalindrome(ListNode head) {
      int size = countListSize(head);
      int[] numList = new int[size];
      for(int i=0; i<size; i++){
          numList[i] = head.val;
          head = head.next;
      }
      int start = 0;
      int end = size - 1;
      while(start <= end) {
          if(numList[start] != numList[end]) return false;
          start++;
          end--;
      }
      return true;
  }
  public int countListSize(ListNode head) {
      int size = 0;
      while(head != null) {
          size++;
          head = head.next;
      }
      return size;
  }
}