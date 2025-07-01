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
    public ListNode swapNodes(ListNode head, int k) {
        
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head, curr = head;
        int len = 0, start = 1; 

        while (curr != null) {
            curr = curr.next;
            len++;
        }

        while (start < k) {
            prev = prev.next;
            start++;
        }

        System.out.println("prev = " + prev.val);

        curr = head;
        start = 1;
        
        while (start < len-k+1) {
            curr = curr.next;
            start++;
        }

        System.out.println("curr = " + curr.val);

        int temp = prev.val;
        prev.val = curr.val;
        curr.val = temp;

        return head;
    }
}