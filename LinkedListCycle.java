import java.util.List;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // 1 step
            fast = fast.next.next;  // 2 steps
            
            // If they crash into each other, there is a loop
            if (slow == fast) {
                return true;
            }
        }
        return false; // Fast reached the end, so no loop
    }
}