class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // 1. Scan the whole map
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 2. Found Land?
                if (grid[i][j] == '1') {
                    count++;        // Count it
                    sink(grid, i, j); // Destroy it and all neighbors
                }
            }
        }
        return count;
    }

    private void sink(char[][] grid, int i, int j) {
        // Base Case: Check bounds and if it is water ('0')
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // 3. Sink the current cell
        grid[i][j] = '0';

        // 4. Recursively sink neighbors (Up, Down, Left, Right)
        sink(grid, i + 1, j);
        sink(grid, i - 1, j);
        sink(grid, i, j + 1);
        sink(grid, i, j - 1);
    }
}
