class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        // 1. Swap the children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // 2. Recurse down
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}