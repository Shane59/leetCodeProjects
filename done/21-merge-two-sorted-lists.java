/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if(l1 == null && l2 == null) return null;
      ListNode ans = new ListNode(0); //fake 0
      ListNode ref = ans;
      while(l1 != null && l2 != null) {
          if(l1.val >= l2.val) {
              ref.next = l2;
              l2 = l2.next;
          }
          else {
              ref.next = l1;
              l1 = l1.next;
          }
          ref = ref.next;
      }
      if(l1 == null) {
          pasteAll(l2, ref);
      }
      else if(l2 == null) {
          pasteAll(l1, ref);
      }
      
      return ans.next;
  }
  
  public ListNode pasteAll(ListNode n, ListNode ans) {
      while(n != null) {
          ans.next = n;
          n = n.next;
          ans = ans.next;
      }
      return ans;
  }
}