import java.util.*;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  // The new "end" (starts as null)
        ListNode curr = head;  // The current node we are processing

        while (curr != null) {
            ListNode temp = curr.next; // 1. Save the next node
            curr.next = prev;          // 2. Reverse the pointer 
            
            // 3. Move both pointers forward
            prev = curr;
            curr = temp;
        }
        
        return prev; 
    }
}
