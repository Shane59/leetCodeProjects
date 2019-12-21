/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        // sort(head);
        if(head == null) return head;
        int[] convertedList = convertToList(head);
        mergeSort(convertedList, size(head));
        ListNode current = head;
        for(int i=0; i<convertedList.length; i++) {
            current.val = convertedList[i];
            current = current.next;
        }
        return head;
    }
    public int size(ListNode head) {
        if(head == null) return 0;
        int size = 1;
        ListNode current = head;
        while(current.next != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    public void mergeSort(int[] list, int size) {
        if(list.length==1) {
            return;
        }
        int middle = size/2;
        int[] left = new int[middle];
        int[] right = new int[size - middle];
        
        for(int i=0; i<left.length; i++) {
            left[i] = list[i];
        }
        for(int i=middle; i<list.length; i++) {
            right[i - middle] = list[i];
        }
        
        mergeSort(left, left.length);
        mergeSort(right, right.length);
        merge(list, left, right);
    }
    public int[] merge(int[] temp, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;
        while(leftIndex < left.length && rightIndex < right.length) {
            if(left[leftIndex] < right[rightIndex]) {
                temp[i++] = left[leftIndex++];
            }
            else {
                temp[i++] = right[rightIndex++];
            }
        }
        while(leftIndex < left.length){
            temp[i++] = left[leftIndex++];
        }
        while(rightIndex < right.length){
            temp[i++] = right[rightIndex++];
        }
        return temp;
    }
    public int[] convertToList(ListNode head) {
        int[] unsortedList = new int[size(head)];
        ListNode current = head;
        int i = 0;
        while(current != null) {
            unsortedList[i++] = current.val;
            current = current.next;
        }
        return unsortedList;
    }
}