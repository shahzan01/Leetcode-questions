class Solution {
       static int fxn(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int tc = 0;
        if (n % 2 != 0) {
            tc++;
        }
        if (m % 2 != 0) {
            tc++;
        }
        boolean hap = false;
        int fourcount = 0;
        int twocount = 0;
        int ans = 0;
        int changes = 0;
        int onecount = 0;
        if (n % 2 != 0) {

            int r = n / 2;
            int i = 0;
            int j = m - 1;
            while (i < j) {
                if (arr[r][i] == arr[r][j]) {
                    if (arr[r][i] == 1) {
                        onecount += 2;
                    }
                } else {
                    onecount += 2;
                    changes++;
                }
                i++;
                j--;

            }

        }

        if (m % 2 != 0) {

            int col = m / 2;
            int i = 0;
            int j = n - 1;
            while (i < j) {
                if (arr[i][col] == arr[j][col]) {
                    if (arr[i][col] == 1) {
                        onecount += 2;
                    }
                } else {
                    onecount += 2;
                    changes++;
                }
                i++;
                j--;

            }
        }

        if (onecount % 4 != 0) {
            if (changes == 0) {
                ans += 2;
            }

        }

        for (int i = 0; i < n / 2; i++) {

            for (int j = 0; j < m / 2; j++) {

                if (i == (n - i - 1) && j != (m - j - 1)) {

                    int oc = 0;
                    if (arr[i][j] == 1) {
                        oc++;
                    }
                    if (arr[i][m - j - 1] == 1) {
                        oc++;
                    }
                    if (tc == 1) {
                        ans += (oc);
                    } else {
                        if (hap == true) {

                            fourcount += oc;

                            if (fourcount >= 2) {
                                ans += (4 - fourcount);
                            } else {
                                ans += (fourcount);
                            }

                        } else {
                            hap = true;
                            fourcount = oc;
                        }

                    }

                } else if (j == (m - j - 1) && i != (n - i - 1)) {
                    System.out.println(i);
                    int oc = 0;
                    if (arr[i][j] == 1) {
                        oc++;
                    }
                    if (arr[n - i - 1][j] == 1) {
                        oc++;
                    }

                    if (tc == 1) {
                        ans += (oc);
                    } else {
                        if (hap == true) {

                            fourcount += oc;
                            if (fourcount >= 2) {
                                ans += (4 - fourcount);
                            } else {
                                ans += (fourcount);
                            }

                        } else {
                            hap = true;
                            fourcount = oc;
                        }

                    }

                } else if ((i == (n - i - 1) && (j == (m - j - 1)))) {

                    if (arr[i][j] == 1) {
                        ans++;
                    }
                } else {

                    int oc = 0;
                    if (arr[i][j] == 1) {
                        oc++;
                    }
                    if (arr[i][m - j - 1] == 1) {
                        oc++;
                    }
                    if (arr[n - i - 1][j] == 1) {
                        oc++;
                    }
                    if (arr[n - i - 1][m - j - 1] == 1) {
                        oc++;
                    }

                    if (oc >= 2) {

                        ans += (4 - oc);

                    } else {

                        ans += oc;

                    }

                }

            }
        }

   if ((n % 2 != 0) && (m % 2 != 0)) {
            if (arr[n / 2][m / 2] == 1) {
                ans++;
            }
        }
        return ans += changes;

    }

    public int minFlips(int[][] grid) {
        return fxn(grid);
    }
}