class Solution {
    // Global counter to track which number we are visiting
    int count = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    private void traverse(TreeNode node, int k) {
        // Base case: If node is null, stop
        if (node == null) return;

        // 1. Go LEFT first (Smallest values are here)
        traverse(node.left, k);

        // 2. Visit the CURRENT Node
        count++; // We found another number
        if (count == k) {
            result = node.val; // This is the one we wanted!
            return;
        }

        // 3. Go RIGHT (Larger values)
        traverse(node.right, k);
    }
}