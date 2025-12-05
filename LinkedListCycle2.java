import java.util.List;

public class LinkedListCycle2 {
    public ListNode detectCycle(List head) {
        ListNode slow = head;
        ListNode fast = head;
        
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                
                
                
                slow = head; // Reset slow to start
                while (slow != fast) {
                    slow = slow.next; 
                    fast = fast.next; 
                }
                return slow; // The meeting point is the start of the cycle
            }
        }
        
        return null; // No cycle
    }
}
