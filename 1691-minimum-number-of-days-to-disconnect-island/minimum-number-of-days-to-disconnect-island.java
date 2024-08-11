class Solution {
      static void dfs(int grid[][], boolean visit[][], int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visit[i][j] == true || grid[i][j] == 0) {
            return;
        }
        visit[i][j] = true;
        dfs(grid, visit, i + 1, j);
        dfs(grid, visit, i, j - 1);
        dfs(grid, visit, i - 1, j);
        dfs(grid, visit, i, j + 1);

        return;
    }

    static int noOfIsland(int grid[][]) {
        boolean visit[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && visit[i][j] == false) {
                    ans++;
                    dfs(grid, visit, i, j);
                }

            }
        }

        return ans;

    }
    public int minDays(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int onecount = 0;
        if (noOfIsland(grid) != 1) {
          return 0;
        }
    
     for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    int a = noOfIsland(grid);
                    if (a != 1) {
                       return 1;
                    }
                    grid[i][j] = 1;
                }
            }
        }
return 2;
    }
}