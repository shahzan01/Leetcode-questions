class Solution {
    public int minFallingPathSum(int[][] arr) {
                int n = arr.length;
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = arr[n - 1][i];
        }

        for (int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            int sMin = Integer.MAX_VALUE;
            int minidx = -1;

            for (int j = 0; j < n; j++) {
                if (dp[j] < min) {
                    min = dp[j];
                    minidx = j;
                }
            }
            for (int j = 0; j < n; j++) {
                if (j == minidx) {
                    continue;
                }
                sMin = Math.min(sMin, dp[j]);
            }

            for (int j = 0; j < n; j++) {
                if (j == minidx) {
                    dp[j] = arr[i][j] + sMin;
                } else {
                    dp[j] = arr[i][j] + min;
                }
            }

        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp[i]);
        }
   return ans;
    }
}