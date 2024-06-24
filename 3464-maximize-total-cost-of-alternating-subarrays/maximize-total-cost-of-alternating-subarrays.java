class Solution {   static long helper(int arr[], int cur, boolean neg, long dp[][]) {
        if (cur >= arr.length) {
            return 0;
        }
        if (dp[cur][1] != -1) {
            return dp[cur][neg == false ? 0 : 1];
        }

        long ans1 = 0;
        long ans2 = 0;
        if (neg == true) {
            return dp[cur][neg == false ? 0 : 1] = arr[cur] + helper(arr, cur + 1, false, dp);
        }

        else {
            ans1 = arr[cur] + helper(arr, cur + 1, false, dp);
            ans2 = (arr[cur] * -1) + helper(arr, cur + 1, true, dp);

        }

        return dp[cur][neg == false ? 0 : 1] = Math.max(ans1, ans2);

    }

    public long maximumTotalCost(int[] arr) {    long dp[][] = new long[arr.length + 1][2];
         for (long[] is : dp) {
            Arrays.fill(is, -1);
        }
      return helper(arr, 0, true, dp);
  
    }
}