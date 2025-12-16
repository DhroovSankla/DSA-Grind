class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 1. Create a Min-Heap (Java's PriorityQueue is a Min-Heap by default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            // 2. Add current number
            minHeap.add(num);

            // 3. If we have more than K elements, kick out the smallest
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 4. The root of the heap is the Kth largest
        return minHeap.peek();
    }
}