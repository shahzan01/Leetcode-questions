class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
         int grid[][] = new int[m][n];
        if (m * n != arr.length) {return new int[0][0];
        }
        int idx = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = arr[idx];
                idx++;
            }
        }return grid; 
    }
}