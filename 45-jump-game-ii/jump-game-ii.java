class Solution {
    public int jump(int[] arr) {
        
        int n = arr.length;
        int dp[] = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            int cur = arr[i];
            int min = Integer.MAX_VALUE;
            int jumpIdx = 1;
            while (jumpIdx <= cur && jumpIdx+i < arr.length) {

                min = Math.min(dp[i + jumpIdx], min);
                jumpIdx++;

            }
           dp[i] = min == Integer.MAX_VALUE ? min : min + 1;

        }
return dp[0];
    }
}