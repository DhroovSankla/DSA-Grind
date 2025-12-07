class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 1. Both empty? Match!
        if (p == null && q == null) return true;
        
        // 2. One empty or values mismatch? Fail!
        if (p == null || q == null || p.val != q.val) return false;
        
        // 3. Recurse: Check left sides AND right sides
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}