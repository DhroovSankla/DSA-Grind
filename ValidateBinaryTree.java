class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start with the full range of Long numbers (to handle Integer.MAX_VALUE edge cases)
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean check(TreeNode node, long min, long max) {
        // 1. Empty trees are valid
        if (node == null) return true;
        
        // 2. The Violation Check: Is this node outside the allowed limits?
        if (node.val <= min || node.val >= max) return false;
        
        // 3. Recurse:
        // - Go Left: Max allowed becomes current node.val
        // - Go Right: Min allowed becomes current node.val
        return check(node.left, min, node.val) && check(node.right, node.val, max);
    }
}