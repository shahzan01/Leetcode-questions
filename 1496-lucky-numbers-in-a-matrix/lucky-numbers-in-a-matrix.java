class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
            int m = mat.length;
        int n = mat[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        Arrays.fill(row, -1);
        Arrays.fill(col, -1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rowmin = row[i] == -1 ? Integer.MAX_VALUE : mat[i][row[i]];
                int colmax = col[j] == -1 ? Integer.MIN_VALUE : mat[col[j]][j];
                if (rowmin > mat[i][j]) {
                    row[i] = j;
                }
                if (colmax < mat[i][j]) {
                    col[j] = i;
                }

            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < row.length; i++) {
            int column = row[i];
            if (col[column] == i) {
                ans.add(mat[i][column]);
            }

        }return ans;
    }
}