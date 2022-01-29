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
  public ListNode reverseList(ListNode head) {
      if (head == null) return head;
      ListNode curr = head;
      ListNode reversed = new ListNode(curr.val);
      curr = curr.next;
      while (curr != null) {
          ListNode temp = new ListNode(curr.val, reversed);
          reversed = temp;
          curr = curr.next;
      }
      return reversed;
  }
}
