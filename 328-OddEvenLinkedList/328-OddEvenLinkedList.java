// Last updated: 5/6/2026, 12:02:23 AM
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
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;
        ListNode current = head.next.next;
        int count = 3;

        while (current != null) {
            if (count % 2 != 0) { // Odd index
                oddTail.next = current;
                oddTail = current;
            } else { // Even index
                evenTail.next = current;
                evenTail = current;
            }
            current = current.next;
            count++;
        }

        oddTail.next = evenHead;
        evenTail.next = null; // Important to terminate the even list

        return oddHead;
    }
}