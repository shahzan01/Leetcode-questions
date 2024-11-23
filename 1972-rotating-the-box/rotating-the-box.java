class Solution {
        static char[][] helper(char box[][]) {
        int m = box.length;
        int n = box[0].length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (box[j][i] == '#') {
                    int c = i;
                    while (c < n - 1 && box[j][c + 1] != '#' && box[j][c + 1] != '*') {
                        box[j][c] = '.';
                        box[j][c + 1] = '#';
                        c++;
                    }
                }
            }
        }
char ans[][]=new char[n][m];
for (int i = 0; i < box.length; i++) {
    for(int j=0;j<box[0].length;j++){
ans[j][m-1-i] = box[i][j];
    }
}
     
        return ans;
    }
    public char[][] rotateTheBox(char[][] box) {
        return helper(box);
    }
}