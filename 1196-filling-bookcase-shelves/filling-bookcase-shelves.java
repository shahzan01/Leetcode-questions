class Solution {
  static int helper(int i, int shelfW, int arr[][], int dp[]) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int curr_width = shelfW;
        int height = 0;
        int ans = Integer.MAX_VALUE;
        for (int j = i; j < arr.length; j++) {
            if (arr[j][0] > curr_width) {
                break;
            }
            curr_width -= arr[j][0];
            height = Math.max(height, arr[j][1]);

            ans = Math.min(ans, helper(j + 1, shelfW, arr, dp) + height);

        }

        return dp[i] = ans;

    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
    
      int dp[]=new int[books.length];
Arrays.fill(dp, -1);
     return helper(0,shelfWidth,books,dp);   
    }
}