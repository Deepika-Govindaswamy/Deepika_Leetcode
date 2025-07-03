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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head, curr = head.next;

        while (curr != null) {
            while (curr != null && prev.val == curr.val) {
                curr = curr.next;
            }
            prev.next = curr;

            if (curr != null) {
                prev = prev.next;
                curr = curr.next;
            }
        }

        return head;
    }
}