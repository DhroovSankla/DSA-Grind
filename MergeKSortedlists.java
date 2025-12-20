class Solution {
public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) return null;

    // 1. Min-Heap of nodes
    PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

    // 2. Add first nodes
    for (ListNode node : lists) {
        if (node != null) pq.offer(node);
    }

    // 3. Dummy node and Tail
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

    // 4. Merge
    while (!pq.isEmpty()) {
        ListNode curr = pq.poll();
        tail.next = curr;
        tail = tail.next;

        if (curr.next != null) {
            pq.offer(curr.next);
        }
    }
    return dummy.next;



   }
}
