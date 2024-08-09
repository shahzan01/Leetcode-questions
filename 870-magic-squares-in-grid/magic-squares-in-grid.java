class Solution {
      static boolean isMagicSquare(int mat[][], int x, int y) {

        int rowsum[] = { 0, 0, 0 };
        int colsum[] = { 0, 0, 0 };
        int dig1 = 0;
        int dig2 = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int rs = 0;
            for (int j = 0; j < 3; j++) {
                int n = mat[x + i][y + j];
                if (n == 0 || n > 9 || hs.contains(n)) {
                    return false;
                }
                hs.add(n);
                rs += n;
            }
            dig2 += mat[x + i][y + 2 - i];
            dig1 += mat[x + i][y + i];
            rowsum[i] = rs;
        }
        for (int i = 1; i < rowsum.length; i++) {
            if (rowsum[i] != rowsum[i - 1]) {
                return false;
            }
        }
        if (dig2 != rowsum[0]) {
            return false;
        }
        if (dig1 != rowsum[0]) {
            return false;
        }

        HashSet<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int cs = 0;
            for (int j = 0; j < 3; j++) {
                int n = mat[j + x][i + y];
                if (n == 0 || n > 9 || hs1.contains(n)) {
                    return false;
                }
                hs1.add(n);
                cs += n;
            }
            colsum[i] = cs;

        }
        for (int i = 1; i < rowsum.length; i++) {
            if (colsum[i] != colsum[i - 1]) {
                return false;
            }
        }
        if (colsum[0] != rowsum[0]) {
            return false;
        }

        return true;
    }
    public int numMagicSquaresInside(int[][] mat) {
         int ans = 0;
        for (int i = 0; i < mat.length - 2; i++) {
            for (int j = 0; j < mat[0].length - 2; j++) {
                if (isMagicSquare(mat, i, j)) {
                    ans++;
                }

            }
        }return ans;
    }
}