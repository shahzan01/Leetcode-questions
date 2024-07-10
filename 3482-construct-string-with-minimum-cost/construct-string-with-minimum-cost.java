class Solution {
 public static TrieNode root = new TrieNode();

    static class TrieNode {
        TrieNode child[] = new TrieNode[26];
        boolean endOFWord;
        int cost;

        TrieNode() {
            for (TrieNode n : child) {
                n = null;
            }
            endOFWord = false;
            cost = 100000;
        }
    }

    static void insert(String s, int c) {
        TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                TrieNode n = new TrieNode();
                cur.child[idx] = n;
            }
            cur = cur.child[idx];
        }
        cur.cost = Math.min(c, cur.cost);
        cur.endOFWord = true;
    }


    public int minimumCost(String target, String[] words, int[] costs) {
        root = new TrieNode();
         int n = target.length();
        int dp[] = new int[target.length() + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < words.length; i++) {
            insert(words[i], costs[i]);
        }
        for (int i = 0; i < n; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }
            TrieNode cur = root;
            for (int j = i; j < target.length(); j++) {
                int idx = target.charAt(j) - 'a';
                if (cur.child[idx] == null) {
                    break;
                }
                cur = cur.child[idx];
                if (cur.endOFWord) {
                    dp[j + 1] = Math.min(dp[j + 1], cur.cost + dp[i]);
                }
            }

        }
   return dp[n]==Integer.MAX_VALUE?-1:dp[n];
    }
}