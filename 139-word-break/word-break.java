class Solution {
    
    static class node {
        node child[] = new node[26];
        boolean endOFWord;

        node() {
            for (node n : child) {
                n = null;
            }
            endOFWord = false;
        }
    }
 static node root = new node();

    static void insert(String s) {
        node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                node n = new node();
                cur.child[idx] = n;
            }
            cur = cur.child[idx];
        }
        cur.endOFWord = true;
    }

    static boolean search(String s,int x,int y) {
        node cur = root;
        for ( int i=x ; i < y; i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                return false;
            }
            cur = cur.child[idx];
        }
        return cur.endOFWord;
    }

    static boolean searchwith(String s) {
        node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                return false;
            }
            cur = cur.child[idx];
        }
        return true;
    }





       static boolean fn(String s, int i, int j, int dp[][]) {
        if (i >= s.length() || j >= s.length()) {
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 0 ? false : true;
        }
        boolean ans = false;
        for (int k = j; k <= s.length(); k++) {
            if (search(s,i,k)) {
                ans = ans || fn(s, k, k, dp);
            }

        }
        dp[i][j] = ans == false ? 0 : 1;

        return ans;

    }

    public boolean wordBreak(String s, List<String> dic) {
        root=new node();         
        for (String i : dic) {
           insert(i);
        }
        int dp[][] = new int[s.length() + 1][s.length() + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return fn(s, 0, 0,dp);

    }
}