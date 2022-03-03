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
        HashMap<Integer, ListNode> numMap = new HashMap<>();
        int i = 1;
        ListNode curr = head;
        
        while (curr != null) {
            numMap.put(i++, curr);
            curr = curr.next;
        }
        ListNode prev = numMap.get(numMap.size() - n);
        ListNode after = new ListNode();
        if (prev != null) {
            after = numMap.get(numMap.size() - n + 2);
            prev.next = after;
        } else {
            head = head.next;
        }
        return head;
    }
}
