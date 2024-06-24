class Solution {
    static int howManyNeig(int board[][], int i, int j) {
        int neig = 0;
        if (i > 0) {
            if (board[i - 1][j] == 1) {
                neig++;
            }
            if (j > 0) {
                if (board[i - 1][j - 1] == 1) {
                    neig++;
                }
            }
            if (j < board[0].length - 1) {
                if (board[i - 1][j + 1] == 1) {
                    neig++;
                }
            }

        }

        if (i < board.length - 1) {
            if (board[i + 1][j] == 1) {
                neig++;
            }
            if (j > 0) {
                if (board[i + 1][j - 1] == 1) {
                    neig++;
                }
            }
            if (j < board[0].length - 1) {
                if (board[i + 1][j + 1] == 1) {
                    neig++;
                }
            }
        }

        if (j > 0) {
            if (board[i][j - 1] == 1) {
                neig++;
            }
        }
        if (j < board[0].length - 1) {
            if (board[i][j + 1] == 1) {
                neig++;
            }
        }
        return neig;

    }

    public void gameOfLife(int[][] matrix) {
         ArrayList<int[]> changes = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int liveneig = howManyNeig(matrix, i, j);
                if (matrix[i][j] == 1) {
                    if (liveneig < 2) {
                        int temp[] = { i, j, 0 };
                        changes.add(temp);
                    } else if (liveneig > 3) {
                        int temp[] = { i, j, 0 };
                        changes.add(temp);

                    } else {
                        continue;
                    }

                } else {
                    if (liveneig == 3) {
                        int temp[] = { i, j, 1 };
                        changes.add(temp);
                    }
                }

            }
        }
        for (int[] is : changes) {
            matrix[is[0]][is[1]] = is[2];
        } 
    }
}