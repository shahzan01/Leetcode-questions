class Solution {
    static void dfs(char arr[][], boolean visit[][], int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '0' || visit[i][j]) {
            return;
        }
        visit[i][j] = true;
        dfs(arr, visit, i + 1, j);
        dfs(arr, visit, i - 1, j);
        dfs(arr, visit, i, j + 1);
        dfs(arr, visit, i, j - 1);

    }
    public int numIslands(char[][] arr) {
          int ans = 0;
        boolean visit[][] = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == '1' && !visit[i][j]) {
                    ans++;
                    dfs(arr, visit, i, j);
                }
            }
        }return ans;
    }
}