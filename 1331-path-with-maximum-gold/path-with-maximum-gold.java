class Solution {
     static int maxgold(int grid[][], int i, int j, boolean visit[][]) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visit[i][j] == true) {
            return 0;
        }

        int cur = grid[i][j];
        visit[i][j] = true;
        int left = maxgold(grid, i, j + 1, visit);
        int right = maxgold(grid, i, j - 1, visit);
        int up = maxgold(grid, i - 1, j, visit);
        int down = maxgold(grid, i + 1, j, visit);

        int max = Math.max(Math.max(up, down), Math.max(left, right));
        visit[i][j] = false;
        return cur + max;

    }
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean visit[][] = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    int gold = maxgold(grid, i, j, visit);
                    ans = Math.max(ans, gold);
                }
            }
        }   return ans==Integer.MIN_VALUE?0:ans;
    }
}