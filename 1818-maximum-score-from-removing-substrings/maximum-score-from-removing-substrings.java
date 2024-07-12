class Solution {
    public int maximumGain(String s, int x, int y) {
         StringBuilder sb = new StringBuilder(s);
        String s1 = "";
        String s2 = "";
        if (x >= y) {
            s1 = "ab";
            s2 = "ba";
        } else {
            s1 = "ba";
            s2 = "ab";
        }
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int ans = 0;
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.substring(i, i + 2).equals(s1)) {
                sb.delete(i, i + 2);
                ans += max;
                i = (i == 0 ? -1: i - 2);

            }

        }
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.substring(i, i + 2).equals(s2)) {
                sb.delete(i, i + 2);
                ans += min;
                i = (i == 0 ? -1 : i - 2);

            }

        }return ans;
    }
}