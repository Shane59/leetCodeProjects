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
  public ListNode oddEvenList(ListNode head) {
      if (head ==null) return null;
      ListNode oddCurrent = head;
      ListNode evenCurrent = head.next;
      ListNode evenStart = evenCurrent;
      while (evenCurrent != null && evenCurrent.next != null) {
          oddCurrent.next = evenCurrent.next;
          oddCurrent = evenCurrent.next;
          evenCurrent.next = oddCurrent.next;
          evenCurrent = oddCurrent.next;
      }
      oddCurrent.next = evenStart;
      return head;
  }
}