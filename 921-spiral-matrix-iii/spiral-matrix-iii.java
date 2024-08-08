class Solution {
static int[][] helper(int mat[][], int sr, int sc) {
        int n = mat.length;
        int m = mat[0].length;
        int curRow = sr;
        int curCol = sc;
        int rightDown = 1;
        int leftUp = 2;

        List<int[]> li = new ArrayList<>();
        while (true) {
            int change = 0;

            for (int i = 0; i < rightDown; i++) {
                if (curRow < n && curRow >= 0 && curCol < m && curCol >= 0) {
                    int temp[] = { curRow, curCol };
                    li.add(temp);

                    change++;
                }
                curCol++;

            }
            for (int i = 0; i < rightDown; i++) {
                if (curRow < n && curRow >= 0 && curCol < m && curCol >= 0) {
                    int temp[] = { curRow, curCol };
                    li.add(temp);
                    change++;
                }
                curRow++;

            }

            for (int i = 0; i < leftUp; i++) {
                if (curRow < n && curRow >= 0 && curCol < m && curCol >= 0) {
                    int temp[] = { curRow, curCol };
                    li.add(temp);
                    change++;
                }
                curCol--;
            }
            for (int i = 0; i < leftUp; i++) {
                if (curRow < n && curRow >= 0 && curCol < m && curCol >= 0) {
                    int temp[] = { curRow, curCol };
                    li.add(temp);
                    change++;
                }
                curRow--;
            }
            System.out.println(change);
            if (change <= 0) {
                break;
            }
            leftUp += 2;
            rightDown += 2;

        }

        int ans[][] = new int[li.size()][2];
        for (int i = 0; i < li.size(); i++) {
            ans[i] = li.get(i);
        }
        return ans;
    }


    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
         int mat[][] = new int[rows][cols];
        
        return helper(mat,rStart,cStart);
    }
}