/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      Queue<Integer> list1 = generateQueue(l1);
      Queue<Integer> list2 = generateQueue(l2);
      return sumLists(list1, list2);
  }
  public Queue<Integer> generateQueue(ListNode arr) {
      Queue<Integer> temp = new LinkedList<>();
      while(arr != null) {
          temp.add(arr.val);
          arr = arr.next;
      }
      return temp;
  }
  public ListNode sumLists(Queue<Integer> list1, Queue<Integer> list2) {
      int add = 0;
      int prevAdditional = 0;
      int currentAdditional = 0;
      if(list1.size() > list2.size()) {
          while(list1.size() != list2.size()) list2.add(0);
      }
      if(list1.size() < list2.size()) {
          while(list1.size() != list2.size()) list1.add(0);
      }
      List<Integer> tempStore = new ArrayList<>();
      while(!list1.isEmpty() && !list2.isEmpty()) {
          int num = list1.poll();
          int num2 = list2.poll();
          int sum = num + num2 + prevAdditional;
          prevAdditional = 0;
          if(sum >= 10) {
              add = sum % 10;
              currentAdditional = sum / 10;
          }
          else {
              add = sum;
          }
          tempStore.add(add);
          prevAdditional = currentAdditional;
          currentAdditional = 0;
      }
      if (prevAdditional != 0) {
          tempStore.add(prevAdditional);
      }
      ListNode ans = new ListNode(tempStore.get(0));
      ListNode current = ans;
      int index = 1;
      System.out.println(tempStore);
      while(index < tempStore.size()) {
          ListNode el = new ListNode(tempStore.get(index++));
          current.next = el;
          current = current.next;
      }
      return ans;
  }
}