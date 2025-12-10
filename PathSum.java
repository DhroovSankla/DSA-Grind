class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        
        // 1. Subtract current value from the target
        targetSum = targetSum - root.val;
        
        // 2. Check if we are at a LEAF and the sum is zero
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        
        // 3. Continue searching left or right
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}