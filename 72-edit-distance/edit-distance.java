class Solution {
  static int fn(StringBuilder s1, StringBuilder s2, int i, int j, int dp[][]) {
        if (j >= s2.length() && i >= s1.length()) {
            return 0;
        }

        if (j >= s2.length() && i < s1.length()) {
            return 1 + fn(s1, s2, i + 1, j, dp);
        }
        if (i >= s1.length() && j < s2.length()) {
            return 1 + fn(s1, s2, i, j + 1, dp);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = fn(s1, s2, i + 1, j + 1, dp);
        }
        int ans1 = fn(s1, s2, i + 1, j, dp);
        int ans2 = fn(s1, s2, i + 1, j + 1, dp);
        int ans3 = fn(s1, s2, i, j + 1, dp);

        return dp[i][j] = Math.min(Math.min(ans1, ans3), ans2) + 1;

    }


    public int minDistance(String word1, String word2) {
         StringBuilder sb = new StringBuilder(word1);
        StringBuilder s = new StringBuilder(word2);
        int dp[][] = new int[sb.length() + 1][s.length() + 1];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }

    return    fn(sb, s, 0, 0, dp);
    }
}