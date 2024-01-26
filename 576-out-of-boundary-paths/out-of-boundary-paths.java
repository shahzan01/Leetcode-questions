class Solution {
 static final int MOD = 1000000007;

static int findpath(int m, int n, int x, int y, int moves, int[][][] dp) {
		if (x >= m || y >= n || x < 0 || y < 0) {
			return 1;
		}

		if (moves == 0) {
			return 0;
		}
		if (dp[x][y][moves] != -1) {
			return dp[x][y][moves];
		}

		int ans1 = findpath(m, n, x + 1, y, moves - 1, dp) % MOD;
		int ans2 = findpath(m, n, x, y + 1, moves - 1, dp) % MOD;
		int ans3 = findpath(m, n, x - 1, y, moves - 1, dp) % MOD;
		int ans4 = findpath(m, n, x, y - 1, moves - 1, dp) % MOD;
	dp[x][y][moves] = ((ans1 + ans2) % MOD + (ans3 + ans4) % MOD)%MOD;
		return dp[x][y][moves];
	}








    public int findPaths(int m, int n, int moves, int x, int y) {
int dp[][][] = new int[m][n][moves + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				for (int k = 0; k < dp[0][0].length; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
		 return findpath(m, n, x, y, moves, dp);




    }
}