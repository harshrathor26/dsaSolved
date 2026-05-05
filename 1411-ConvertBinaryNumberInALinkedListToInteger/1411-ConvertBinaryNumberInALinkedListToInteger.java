// Last updated: 5/6/2026, 12:02:03 AM
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
    public int getDecimalValue(ListNode head) {
        int s=0;
        while(head!=null){
            s*=2;
            s+=head.val;
            head=head.next;
        }
        return s;
    }
}