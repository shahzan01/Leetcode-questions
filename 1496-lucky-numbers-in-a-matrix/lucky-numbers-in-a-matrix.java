class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
              int m = mat.length;
        int n = mat[0].length;

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int min = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < mat[i][min]) {
                    min = j;
                }
            }
            int max = 0;
            for (int j = 0; j < m; j++) {
                if (mat[j][min] > mat[max][min]) {
                    max = j;
                }
            }
            System.out.println(min + "," + max);
            if (max == i) {
                ans.add(mat[i][min]);
            }

        }return ans;
    }
}