class Solution {
    public int maxDepth(TreeNode root) {
        // Base Case: Empty tree has height 0
        if (root == null) return 0;
        
        // Recursive Step: 1 + max of children
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}