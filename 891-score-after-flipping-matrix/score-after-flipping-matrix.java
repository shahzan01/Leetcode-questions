class Solution {
     static void inverseRow(int grid[][], int r) {
        for (int i = 0; i < grid[0].length; i++) {
            grid[r][i] = 1 ^ grid[r][i];
        }
    }

    static void inverseCol(int grid[][], int c) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][c] = 1 ^ grid[i][c];
        }
    }

    static int binTodec(int grid[][], int r) {
        int n = 0;
        int p = 0;
        for (int i = grid[0].length - 1; i >= 0; i--) {
            n += Math.pow(2, p) * grid[r][i];
            p++;
        }
        return n;
    }
    public int matrixScore(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                inverseRow(grid, i);
            }
        }
        for (int i = 1; i < n; i++) {
            int count1 = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1) {
                    count1++;
                } else {
                    count1--;
                }
            }
            if (count1 < 0) {
                inverseCol(grid, i);
            }
        }
int ans=0;
        for (int i = 0; i < m; i++) {
          ans+= binTodec(grid, i);
        }
return ans;
    }
}