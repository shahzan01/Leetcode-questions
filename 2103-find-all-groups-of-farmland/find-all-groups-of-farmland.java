class Solution {
     static void dfs(int arr[][], int i, int j, int[] cor) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0) {
            return;
        }
        cor[2] = Math.max(i, cor[2]);
        cor[3] = Math.max(cor[3], j);
        arr[i][j] = 0;
        dfs(arr, i + 1, j, cor);
        dfs(arr, i - 1, j, cor);
        dfs(arr, i, j + 1, cor);
        dfs(arr, i, j - 1, cor);

    }
    public int[][] findFarmland(int[][] arr) {
         ArrayList<int[]> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    int cor[] = new int[4];
                    cor[0] = i;
                    cor[1] = j;
                    dfs(arr, i, j, cor);
                    al.add(cor);
                   
                }
            }
        }
int ans[][] = new int[al.size()][4];
        int i = 0;
        for (int[] is : al) {
            ans[i] = is;
            i++;
        }return ans;
    }
}