class Solution {
    int maxDiameter = 0; // Global variable to keep track of the winner

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxDiameter;
    }

    // This is basically the "Max Depth" function from Sunday!
    private int calculateHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Update the global maximum diameter found so far
        // The path through THIS node is left + right
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return height to the parent (standard height logic)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
