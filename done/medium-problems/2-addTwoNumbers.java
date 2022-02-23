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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int maxSize = Math.max(countSize(l1), countSize(l2));
        
        int[] l1List = nodeToList(l1, maxSize);
        int[] l2List = nodeToList(l2, maxSize);
        
        int sumFirst = l1List[0] + l2List[0];
        int extra = 0;
        if (sumFirst / 10 > 0) {
            extra = sumFirst / 10;
            sumFirst = sumFirst % 10;
        }
        
        ListNode ans = new ListNode(sumFirst);
        ListNode ansTemp = ans;
        
        
        for (int i = 1; i < l1List.length; i++) {
            int sum = l1List[i] + l2List[i] + extra;
            
            if (sum / 10 > 0) {
                extra = sum / 10;
                sum = sum % 10;
            } else {
                extra = 0;
            }
            ListNode temp = new ListNode(sum);
            ansTemp.next = temp;
            ansTemp = ansTemp.next;
        }
        if (extra > 0) {
            ansTemp.next = new ListNode(extra);
        }
        
        return ans;
    }
    
    private static int[] nodeToList(ListNode l, int size) {
        int[] ans = new int[size];
        ListNode curr = l;
        int j = 0;
        
        for (int i = 0; i < size; i++) {
            if (curr != null) {
                ans[i] = curr.val;
                curr = curr.next;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
    
    private static int countSize(ListNode l) {
        int size = 0;
        ListNode curr = l;
        
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}
