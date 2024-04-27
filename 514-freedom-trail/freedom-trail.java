class Solution {
 static int distance(int l, int a, int b) {
        return Math.min(Math.abs(a - b), l - Math.abs(a - b));
    }

    static int min = Integer.MAX_VALUE;

    static int fxn(String k, String r, int cur, int curLetter, ArrayList<Integer> graph[], int dp[][]) {

        if (curLetter >= k.length()) {
            return 0;
        }
        if (dp[cur][curLetter] != -1) {
            return dp[cur][curLetter];
        }
        char c = k.charAt(curLetter);
        int idx = c - 'a';
        int a = Integer.MAX_VALUE;
        for (Integer i : graph[idx]) {
            int dis = distance(r.length(), cur, i);

            int ans = fxn(k, r, i, curLetter + 1, graph, dp) + 1 + dis;

            a = Math.min(a, ans);
        }
        return dp[cur][curLetter] = a;
    }





    public int findRotateSteps(String r, String k) {
        int n = r.length();
        min = Integer.MAX_VALUE;
        ArrayList<Integer> graph[] = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            char c = r.charAt(i);
            graph[c - 'a'].add(i);
        }
        int dp[][] = new int[r.length()][k.length()];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
return fxn(k, r, 0, 0, graph, dp);

    }
}