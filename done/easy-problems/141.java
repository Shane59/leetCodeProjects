/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
      if(head == null || head.next == null) {
          return false;
      }
      ListNode slowPointer = head;
      ListNode skipTwo = head;
      while(skipTwo != null && skipTwo.next != null){
          slowPointer = slowPointer.next;
          skipTwo = skipTwo.next.next;
          if(slowPointer == skipTwo) return true;
      }
      return false;
  }
}