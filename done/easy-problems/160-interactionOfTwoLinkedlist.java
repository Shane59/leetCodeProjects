/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      Set<ListNode> nodeList = new HashSet<>();
      ListNode current = headA;
      while(current != null) {
          nodeList.add(current);
          current = current.next;
      }
      ListNode nodeB = headB;
      while(nodeB != null) {
          if(nodeList.contains(nodeB)) {
              return nodeB;
          }
          nodeB = nodeB.next;
      }
      return null;
  }
}