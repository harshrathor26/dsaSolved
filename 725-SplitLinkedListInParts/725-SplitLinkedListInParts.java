// Last updated: 5/6/2026, 12:02:14 AM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int baseSize = length / k;
        int remainder = length % k;
        ListNode[] result = new ListNode[k];
        current = head;
        for (int i = 0; i < k; i++) {
           result[i] = current;
            int partSize = baseSize + (i < remainder ? 1 : 0);
            ListNode prev = null;
            for (int j = 0; j < partSize; j++) {
                prev = current;
                if (current != null) {
                    current = current.next;
                }
            }
            if (prev != null) {
                prev.next = null;
            }
        }

        return result; 
    }
}