class Solution {

    static int fn(int arr[], int idx, int transactionLeft, int buy, int dp[][][]) {
        if (idx >= arr.length || transactionLeft == 0) {
            return 0;
        }
        if (dp[idx][buy][transactionLeft] != -1) {
            return dp[idx][buy][transactionLeft];
        }
        int ans = 0;
        if (buy == 0) {

            ans = Math.max(fn(arr, idx + 1, transactionLeft, 0, dp),
                    fn(arr, idx + 1, transactionLeft, 1, dp) - arr[idx]);

        } else {
            ans = Math.max(fn(arr, idx + 1, transactionLeft, buy, dp),
                    arr[idx] + fn(arr, idx + 1, transactionLeft - 1, 0, dp));
        }

        return dp[idx][buy][transactionLeft] = ans;

    }


    public int maxProfit(int[] arr) {
          int dp[][][] = new int[arr.length + 1][2][3];
        for (int[][] is : dp) {
            for (int[] is2 : is) {

                Arrays.fill(is2, -1);
            }
        }
return fn(arr, 0, 2, 0, dp);

    }
}