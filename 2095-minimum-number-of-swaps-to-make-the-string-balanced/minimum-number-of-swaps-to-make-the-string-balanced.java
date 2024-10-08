class Solution {
    public int minSwaps(String s) {
          StringBuilder sb = new StringBuilder(s);
        int ans = 0;
        int openCount = 0;
        int closeCount = 0;
        int last = sb.length() - 1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '[') {
                openCount++;
            } else {
                closeCount++;
            }
            if (closeCount > openCount) {
                while (sb.charAt(last) != '[') {
                    last--;
                }
                sb.replace(last, last + 1, "]");
                closeCount--;
                openCount++;
                ans++;
            }
       
        }return ans;
    }
}