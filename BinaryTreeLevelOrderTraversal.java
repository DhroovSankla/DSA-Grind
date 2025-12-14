class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // The Result List
        List<List<Integer>> result = new ArrayList<>();
        
        // Base Case: If tree is empty, return empty list
        if (root == null) return result;

        // 1. Initialize the Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // 2. Loop while there are nodes to process
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // CRITICAL: Snapshot the size of the current level
            List<Integer> currentLevel = new ArrayList<>();

            // 3. Process exactly 'levelSize' nodes (The current floor)
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll(); // Get the node
                currentLevel.add(currentNode.val);   // Add to level list

                // 4. Add children to the queue (Prep for next floor)
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }

            // Add the finished level to the result
            result.add(currentLevel);
        }

        return result;
    }
}