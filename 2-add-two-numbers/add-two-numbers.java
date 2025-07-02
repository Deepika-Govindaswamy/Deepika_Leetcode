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
        
        int sum = 0, carry = 0;
        ListNode resultHead = new ListNode (0);
        ListNode curr = resultHead;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode node = new ListNode (sum);
            curr.next = node;
            curr = node;

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            while (l1 != null) {
                sum = l1.val + carry;
                carry = sum / 10;
                sum = sum % 10;

                ListNode node = new ListNode (sum);
                curr.next = node;
                curr = node;

                l1 = l1.next;
            }
        }

        if (l2 != null) {
            while (l2 != null) {
                sum = l2.val + carry;
                carry = sum / 10;
                sum = sum % 10;

                ListNode node = new ListNode (sum);
                curr.next = node;
                curr = node;

                l2 = l2.next;
            }
        }


        if (carry != 0) {
            ListNode node = new ListNode (carry);
            curr.next = node;
            curr = node;
        }

        return resultHead.next;
    }
}