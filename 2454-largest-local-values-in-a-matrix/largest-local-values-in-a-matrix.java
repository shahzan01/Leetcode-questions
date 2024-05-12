class Solution {
    public int[][] largestLocal(int[][] arr) {
         int n = arr.length;
        int ans[][] = new int[n - 2][n - 2];

        for (int i = 0; i + 2 < n; i++) {
            for (int j = 0; j + 2 < n; j++) {

                int max = Integer.MIN_VALUE;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max, arr[k][l]);
                    }
                }
                ans[i][j] = max;

            }
        }return ans;
    }
}