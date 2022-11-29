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
        
        if( head == null || head.next == null ) {
            
            head = null;
            return head;
        }
        
        ListNode first = head;
        int size = 0;
        
        while ( first != null){
            size++;
            first = first.next;
        }
        
        if( n == size) return head.next;
        
        first = head;
        for( int i = 1; i != size-n; i++){
            first = first.next;
        }
        
        first.next = first.next.next;
        
        return head;
    }
}