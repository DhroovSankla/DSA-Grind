class Solution {
    public boolean isBalanced(TreeNode root) {
        // Base Case: An empty tree is always balanced
        if (root == null) return true;
        
        // 1. Calculate heights of left and right children
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        // 2. The Condition: Gap must be <= 1
        if (Math.abs(leftHeight - rightHeight) > 1) return false;
        
        // 3. Recurse: Check if the subtrees below are also balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    // --> HELPER FUNCTION (You know this one!) <--
    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}