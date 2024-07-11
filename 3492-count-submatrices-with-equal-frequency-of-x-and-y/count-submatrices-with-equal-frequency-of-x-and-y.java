class Solution {
    public int numberOfSubmatrices(char[][] grid) {
      int n = grid.length;
        int m = grid[0].length;
        int prefix[][] = new int[n + 1][m + 1];
        for (int i = 1; i < prefix.length; i++) {
            for (int j = 1; j < prefix[0].length; j++) {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1]
                        + (grid[i - 1][j - 1] == 'X' ? 1 : 0);

            }
        }
        int ans = 0;
        int prefixy[][] = new int[n + 1][m + 1];
        for (int i = 1; i < prefix.length; i++) {
            for (int j = 1; j < prefix[0].length; j++) {
                prefixy[i][j] = prefixy[i - 1][j] + prefixy[i][j - 1] - prefixy[i - 1][j - 1]
                        + (grid[i - 1][j - 1] == 'Y' ? 1 : 0);
                if (prefix[i][j] == prefixy[i][j] && prefix[i][j]>0) {
                    ans++;
                }
            }
        }return ans;   
    }
}