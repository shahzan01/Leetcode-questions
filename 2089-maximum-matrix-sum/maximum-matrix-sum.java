class Solution {
    public long maxMatrixSum(int[][] mat) {
          long ans = 0;
        int c = 0;
        boolean zero = false;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                min = Math.min(min, Math.abs(mat[i][j]));
                if (mat[i][j] < 0) {
                    c++;
                    ans += (-1 * mat[i][j]);
                } else if (mat[i][j] == 0) {
                    zero = true;
                }

                else {
                    ans += mat[i][j];
                }
            }
        }

        if (zero || c % 2 == 0) {
return ans;
        } else {
            ans -= 2 * min;
        }
return ans;

    }
}