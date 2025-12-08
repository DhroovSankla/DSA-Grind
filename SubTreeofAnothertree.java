class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Base Case: If main tree runs out, we didn't find the subtree
        if (root == null) return false;
        
        // 1. Check if the trees match starting right HERE
        if (isSameTree(root, subRoot)) return true;
        
        // 2. If not, check left or right children
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    // --> HELPER FUNCTION (Same as yesterday) <--
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}