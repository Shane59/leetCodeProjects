/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode middleNode(ListNode head) {
      int size = findSize(head);
      int middle = size / 2;
      for(int i = 0; i < middle; i++) {
          head = head.next;
      }
      return head;
  }
  public int findSize(ListNode head) {
      ListNode current = head;
      int size = 0;
      while(current != null) {
          size++;
          current = current.next;
      }
      return size;
  }
}