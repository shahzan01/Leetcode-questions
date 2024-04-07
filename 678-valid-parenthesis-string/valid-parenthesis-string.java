class Solution {
       static boolean towpointer(String s) {
        int n = s.length();
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = s.charAt(n - i - 1);
            if (c == '(' || c == '*') {
                open++;
            } else {
                open--;
            }
            if (d == ')' || d == '*') {
                close++;
            } else {
                close--;
            }

            if (open < 0 || close < 0) {
                return false;
            }

        }
        return true;

    }
    public boolean checkValidString(String s) {
        return towpointer(s);
    }
}