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
    public ListNode middleNode(ListNode head) {
        
        ListNode first = head;
        int size = 0;
        
        while( first != null ){
            size++;
            first = first.next;
        }
        
        first = head;
        for( int i = 1; i < (size/2) + 1; i++){
            first = first.next;
        }
        
        return first;
    }
}