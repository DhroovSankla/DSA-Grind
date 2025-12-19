
 class Solution { 
       public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the head itself needs to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        if (head == null) return null;
        
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                // Point to the one after next (The Jump)
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}