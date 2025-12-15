class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 1. Base Case: End of branch OR we found one of the targets
        if (root == null || root == p || root == q) {
            return root;
        }

        // 2. Search deeper
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 3. Logic: Where did we find them?
        
        // If both sides returned a node, it means p and q are in different subtrees.
        // Therefore, ROOT is the split point (LCA).
        if (left != null && right != null) {
            return root;
        }

        // If only one side returned something, that means both p and q 
        // are in that one side (or we only found one so far).
        return (left != null) ? left : right;
    }
}