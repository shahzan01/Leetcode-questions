class Solution {
    public int maximumLength(int[] arr, int k) {
              int ans = Integer.MIN_VALUE;
        for (int mod = 0; mod < k; mod++) {
            int dp[] = new int[k];
            for (int i = 0; i < arr.length; i++) {
                int currRem = arr[i] % k;
                int secRem = (mod - currRem + k) % k;
                dp[currRem] = Math.max(dp[currRem], 1 + dp[secRem]);
                ans = Math.max(ans, dp[currRem]);
            }

        }return ans;
    }
}