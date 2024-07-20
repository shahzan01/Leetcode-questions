class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
         int ans[][] = new int[rowSum.length][colSum.length];
        int n = rowSum.length;
        int m = colSum.length;
        for (int i = 0; i < n; i++) {
            ans[i][0] = rowSum[i];
        }
        int curRow = n - 1;
        for (int i = m - 1; i >= 1; i--) {
            int curcolsum = colSum[i];
            while (curcolsum > 0) {
                if (ans[curRow][0] > curcolsum) {
                    ans[curRow][0] -= curcolsum;
                    ans[curRow][i] = curcolsum;
                    curcolsum = 0;
                    continue;
                }

                else {
                    ans[curRow][i] = ans[curRow][0];
                    ans[curRow][0] = 0;
                    curcolsum -= ans[curRow][i];
                    curRow--;

                }

            }

        }return ans;
    }
}