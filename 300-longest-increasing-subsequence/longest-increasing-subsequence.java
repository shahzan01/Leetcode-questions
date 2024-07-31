class Solution {
         static int hel(int arr[]) {
        int max=1;
        int dp[] = new int[arr.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max=Math.max(max, dp[i]);
            }

        }

return max;
    }

    public int lengthOfLIS(int[] nums) {
        return hel(nums);
    }
}