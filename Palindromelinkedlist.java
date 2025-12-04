class Solution {
    public boolean isPalindrome(ListNode head) {
        // Step 1: Find the Middle (Tortoise and Hare)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half (starting from 'slow')
        ListNode prev = null;
        while (slow != null) {
            ListNode nextTemp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextTemp;
        }

        // Step 3: Compare the start vs. the end
        ListNode left = head;
        ListNode right = prev; // 'prev' is the head of the reversed part
        
        while (right != null) {
            if (left.val != right.val) {
                return false; // Mismatch found
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
