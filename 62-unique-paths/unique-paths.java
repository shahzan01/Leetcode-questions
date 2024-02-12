class Solution {
    static int helper(int m, int n, int x, int y, int[][] dp) {

        if (x == m - 1 && y == n - 1) {
            return 1;
        }
        if (x >= m || y >= n) {
            return 0;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        int ans1 = helper(m, n, x + 1, y, dp);
        int ans2 = helper(m, n, x, y + 1, dp);
        return dp[x][y]= ans1 + ans2;

    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }

        return helper(m, n, 0, 0, dp);
    }
}