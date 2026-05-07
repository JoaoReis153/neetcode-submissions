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
        ListNode h = head;
        ListNode pointer = head;
        int counter = 0;
        
        while(pointer != null) {
            counter++;
            pointer = pointer.next;
        }

        int jumps = counter - n;

        if (jumps == 0) return head.next;
        
        while (h != null) {
            jumps--; 
            if (jumps == 0) {
                h.next = h.next.next;
                break;
            } 

            
            h = h.next;
        }

        return head;

    }
}
