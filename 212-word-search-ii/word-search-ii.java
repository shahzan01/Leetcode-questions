class Solution {
 public static node root = new node();

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

    static boolean search(String s) {
        node cur = root;
        for (int i = 0; i < s.length(); i++) {
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

 static void helper(char[][] board, int i, int j, boolean visit[][], HashSet<String> hs, StringBuilder sb) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visit[i][j] == true) {
            return;
        }

        sb.append(board[i][j]);
        visit[i][j] = true;
        String cur = sb.toString();

 if (searchwith(cur)) {
 if (search(cur)) {
                hs.add(cur);
            }
            helper(board, i + 1, j, visit, hs, sb);
            helper(board, i, j + 1, visit, hs, sb);
            helper(board, i, j - 1, visit, hs, sb);
            helper(board, i - 1, j, visit, hs, sb);
            sb.deleteCharAt(sb.length() - 1);
            visit[i][j] = false;
            return;

        } else {
            sb.deleteCharAt(sb.length() - 1);
            visit[i][j] = false;
            return;
        }



















    }

    public List<String> findWords(char[][] board, String[] word) {
root=new node();
 for (String s : word) {
            insert(s);
        }
         HashSet<String> hs = new HashSet<>();

        boolean visit[][] = new boolean[board.length][board[0].length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                helper(board, i, j, visit, hs, sb);
            }
        }
        List<String> ans = new ArrayList<>(hs);
return ans;










    }
}