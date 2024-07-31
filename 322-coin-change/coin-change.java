class Solution {
 static int hel(int arr[], int amount, int idx, int dp[]) {
        if (amount <= 0) {
            return 0;
        }
        if (idx >= arr.length) {
            return Integer.MAX_VALUE;
        }
        if (dp[amount] != -1) {
            return dp[amount];
        }
      int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = idx; i < arr.length; i++) {
            if (amount >= arr[i]) {
                ans1 = hel(arr, amount - arr[i], 0, dp);
            }
            ans2 = hel(arr, amount, i + 1, dp);

            int m = Math.min(ans1, ans2) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(ans1, ans2) + 1;
            min = Math.min(min, m);

        }
        return dp[amount] = min;

    }


    public int coinChange(int[] arr, int am) {
          int dp[] = new int[am + 1];
        Arrays.fill(dp, -1);
        int ans= hel(arr, am, 0, dp);
     return  ans==Integer.MAX_VALUE?-1:ans;
    }
}