class Solution {
    public void rotate(int[][] matrix) {
        // // clockwise -> swap tom and bottoms then swap symmetry s[i][j]=s[j][i]
        // // 1.swap top and bottoms
        // for (int i = 0; i < n / 2; i++) {
        // for (int j = 0; j < n; j++) {
        // int temp = matrix[i][j];
        // matrix[i][j] = matrix[n - i - 1][j];
        // matrix[n - i - 1][j] = temp;
        // }
        // }
        // // 2. swap symmetry

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // int temp = matrix[i][j];
        // matrix[i][j] = matrix[j][i];
        // matrix[j][i] = temp;
        // }
        // }
        // // Anticlockwise swap left and right then swap symmetry
        // // 1.swap left and right
        // for (int i = 0; i < n / 2; i++) {
        //     for (int j = 0; j < n; j++) {
        //         int temp = matrix[j][i];
        //         matrix[j][i] = matrix[j][n - i - 1];
        //         matrix[j][n - i - 1] = temp;
        //     }
        // }
        // // 2. swap symmetry

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }  
 int n = matrix.length;
    
        for (int i = 0; i < n / 2; i++) {
        for (int j = 0; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - i - 1][j];
        matrix[n - i - 1][j] = temp;
        }
        }
    

        for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        }
        }



    }
}