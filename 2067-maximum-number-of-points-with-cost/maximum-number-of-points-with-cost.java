class Solution {
    public long maxPoints(int[][] arr) {
          long dp[][] = new long[arr.length + 1][arr[0].length + 1];
        for (long[] is : dp) {
            Arrays.fill(is, -1);
        }
        long left_max[] = new long[arr[0].length];
        long right_max[] = new long[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            dp[0][i] = arr[0][i];
        }
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    left_max[j] = dp[i - 1][j];
                    continue;
                }
                left_max[j] = Math.max(left_max[j - 1] - 1, dp[i - 1][j]);
            }

            for (int j = m - 1; j >= 0; j--) {
                if (j == m - 1) {
                    right_max[j] = dp[i - 1][j];
                    continue;
                }
                right_max[j] = Math.max(right_max[j + 1] - 1, dp[i - 1][j]);
            }
          
            for (int j = 0; j < m; j++) {
                dp[i][j] = arr[i][j] + Math.max(right_max[j], left_max[j]);
            }

        }
        long ans = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, dp[n - 1][i]);
        }
        return ans;
    }
}