class Solution {
          static int hel(int grid[][], int x, int y, int dp[][]) {
        if (x >= grid.length || y >= grid[0].length || x < 0 || y < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        if (x == grid.length - 1 && y == grid[0].length - 1) {
            return grid[x][y];
        }

        int ans1 = hel(grid, x + 1, y, dp);
        int ans2 = hel(grid, x, y + 1, dp);
        return dp[x][y] = Math.min(ans1, ans2) + grid[x][y];

    }

    public int minPathSum(int[][] grid) {
          int dp[][] = new int[grid.length + 1][grid[0].length + 1];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
     return hel(grid,0,0,dp);   
    }
}