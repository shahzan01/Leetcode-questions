class Solution {
    static boolean helper(char[][] board, String s, int i, int j, int cur, boolean visit[][]) {
        if (i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] != s.charAt(cur)
                || visit[i][j] == true) {
            return false;
        }
        if (board[i][j] == s.charAt(cur) && cur == s.length() - 1) {
            return true;
        }
        visit[i][j] = true;
        boolean up = helper(board, s, i - 1, j, cur + 1, visit);
        boolean down = helper(board, s, i + 1, j, cur + 1, visit);
        boolean right = helper(board, s, i, j + 1, cur + 1, visit);
        boolean left = helper(board, s, i, j - 1, cur + 1, visit);
        visit[i][j] = false;
        return right | left | up | down;

    }

    public boolean exist(char[][] board, String s) {
         boolean visit[][] = new boolean[board.length][board[0].length];
    
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == s.charAt(0)) {
                    if (helper(board, s, i, j, 0, visit)) {
                       return true;
                    }
                }
            }
        }
      return false;
    }
}