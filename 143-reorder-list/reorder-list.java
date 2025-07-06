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
    public void reorderList(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode end = reverse (slow);
        slow.next = null;
        ListNode start = head;

        while (start.next != null && end.next != null) {
            ListNode startNext = start.next;
            ListNode endNext = end.next;

            start.next = end;
            end.next = startNext;

            start = startNext;
            end = endNext;
        }
        
    }

    ListNode reverse (ListNode head) {
        ListNode prev = head, curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}