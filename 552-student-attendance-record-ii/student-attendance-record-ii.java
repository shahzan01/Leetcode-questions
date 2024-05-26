class Solution {
    
    static int mod = 1000000007;
    static int fxn(int l, int ab, int n, int dp[][][]) {
        if (dp[ab][l][n] != -1) {
            return dp[ab][l][n];
        }

        if (n <= 0) {
            return 1;
        }
        int ans1 = 0;
        int ans2 = 0;
        if (ab > 0) {
            ans1 = fxn(2, 0, n - 1, dp);
        }

        if (l > 0) {
            ans2 = fxn(l - 1, ab, n - 1, dp);
        }

        return dp[ab][l][n] = ((ans1 + ans2) % mod + fxn(2, ab, n - 1, dp)) % mod;

    }
    public int checkRecord(int n) {
         int l = 2;
        int ab = 1;

        int dp[][][] = new int[2][3][n + 1];
        for (int[][] is : dp) {
            for (int[] is2 : is) {
                Arrays.fill(is2, -1);
            }
        }

       return fxn(l, ab, n, dp);
    }
}