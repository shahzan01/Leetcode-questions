class Solution {
    public void setZeroes(int[][] matrix) {
         ArrayList<int[]> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    int temp[] = { i, j };
                    al.add(temp);
                }
            }
        }
        for (int[] is : al) {
            int row = is[0];
            int col = is[1];
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }

        }
    }
}