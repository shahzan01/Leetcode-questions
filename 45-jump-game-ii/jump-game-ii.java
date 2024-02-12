class Solution {
    public int jump(int[] arr) {
         int n = arr.length;
        int dp[] = new int[n];
        dp[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
                continue;
            }
            if (arr[i] + i >= n - 1) {
                dp[i] = 1;
                continue;
            }
            int val = arr[i];
            int min = Integer.MAX_VALUE;
            while (val > 0) {
                min = Math.min(min, dp[i + val]);
                val--;
            }
           
            if (min == Integer.MAX_VALUE) {
                dp[i] = Integer.MAX_VALUE;
            } else {
                dp[i] = min + 1;
            }

        }
        return dp[0];
    }
}