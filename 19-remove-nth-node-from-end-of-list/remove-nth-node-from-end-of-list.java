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
        
        if (head == null || head.next == null) {
            return null;
        }

        ListNode curr = head;

        int len = 0;

        while (curr != null) {
            curr = curr.next;
            len++;
        }

        if (n == len) {
            return head.next;
        }

        curr = head;

        for (int i = 1; i < len - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}