class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Use a dummy node to handle the case where we delete the Head itself
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        // 1. Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // 2. Move both until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 3. Skip the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}
