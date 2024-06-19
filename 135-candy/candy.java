class Solution {
    public int candy(int[] arr) {
          int dp[] = new int[arr.length];
        int n = arr.length;
        Arrays.fill(dp, 1);
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }

        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                dp[i] = Math.max(dp[i], dp[i+1]+1);
            }
            ans += dp[i];
        }
        ans += dp[n - 1];
        return ans;
    }
}