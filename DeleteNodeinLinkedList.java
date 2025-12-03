class Solution {
    public void deleteNode(ListNode node) {
        // Step 1: Steal the value from the neighbor
        node.val = node.next.val;
        
        // Step 2: Skip over the neighbor
        node.next = node.next.next;
    }
}