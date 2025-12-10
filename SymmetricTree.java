class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        // Start the mirror check comparing left child vs right child
        return isMirror(root.left, root.right);
    }
    
    // Helper function to compare two sides
    private boolean isMirror(TreeNode node1, TreeNode node2) {
        // 1. Both empty? Match.
        if (node1 == null && node2 == null) return true;
        
        // 2. One empty or values different? No Match.
        if (node1 == null || node2 == null || node1.val != node2.val) return false;
        
        // 3. Compare Outer pairs and Inner pairs
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}