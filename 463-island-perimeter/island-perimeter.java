class Solution {
    public int islandPerimeter(int[][] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    int s = 0;
                    if (i - 1 >= 0) {
                        if (arr[i - 1][j] == 1) {
                            s++;
                        }
                    }
                    if (j - 1 >= 0) {
                        if (arr[i][j - 1] == 1) {
                            s++;
                        }
                    }
                    if (j + 1 < arr[0].length) {
                        if (arr[i][j + 1] == 1) {
                            s++;
                        }
                    }
                    if (i + 1 < arr.length) {
                        if (arr[i + 1][j] == 1) {
                            s++;
                        }
                    }
                    ans += (4 - s);
                }

            }
        }return ans;
    }
}