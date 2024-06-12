class Solution {
       static boolean fn(String s, int i, int j, HashSet<String> hs, int dp[][]) {
        if (i >= s.length() || j >= s.length()) {
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 0 ? false : true;
        }
        boolean ans = false;
        for (int k = j; k <= s.length(); k++) {
            String sub = s.substring(i, k);

            if (hs.contains(sub)) {
                ans = ans || fn(s, k, k, hs, dp);
            }

        }
        dp[i][j] = ans == false ? 0 : 1;

        return ans;

    }


    public boolean wordBreak(String s, List<String> dic) {
         HashSet<String> hs = new HashSet<>();
        for (String i : dic) {
            hs.add(i);
        }
        int dp[][] = new int[s.length() + 1][s.length() + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return fn(s, 0, 0, hs,dp);

    }
}