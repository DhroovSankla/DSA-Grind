class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        
        // 1. Initialize: Find all rotten oranges and count fresh ones
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if(grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        if(freshCount == 0) return 0; // No fresh oranges to rot
        
        int minutes = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        
        // 2. BFS: Spread the rot level by level
        while(!queue.isEmpty() && freshCount > 0) {
            minutes++;
            int size = queue.size(); // Process this entire minute's batch
            
            for(int i=0; i<size; i++) {
                int[] point = queue.poll();
                int r = point[0];
                int c = point[1];
                
                for(int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    
                    // If neighbor is valid and fresh, rot it
                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; // Mark as rotten
                        queue.offer(new int[]{nr, nc});
                        freshCount--;
                    }
                }
            }
        }
        
        return freshCount == 0 ? minutes : -1;
    }
}
