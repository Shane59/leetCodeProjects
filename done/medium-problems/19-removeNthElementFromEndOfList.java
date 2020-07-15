/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode current = head;
      int size = 0;
      while (current != null) {
          current = current.next;
          size++;
      }
      
      ListNode current2 = head;
      ListNode prev = null;
      int targetIndex = size - n;
      int index = 0;
      while (current2 != null && index < targetIndex) {
          prev = current2;
          current2 = current2.next;
          index++;
      }
      if (targetIndex == 0) {
          if (size > 1) {
              head = head.next;
          } else {
              return null;
          }
      }
      if (prev != null) {
          prev.next = current2.next;
      }
      
      return head;
  }
}