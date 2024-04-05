class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
       
        int ans = sb.length();
        for (int i = 0; i < sb.length() - 1; i++) {
            char c = sb.charAt(i);
            char d = sb.charAt(i + 1);
            if ((int) Math.abs(c - d) == 32) {

                sb.delete(i, i + 2);
            }
        }
        while (ans != sb.length() && sb.length() > 0) {
            ans = sb.length();

            for (int i = 0; i < sb.length() - 1; i++) {
                char c = sb.charAt(i);
                char d = sb.charAt(i + 1);
                if ((int) Math.abs(c - d) == 32) {
                    sb.delete(i, i + 2);
                }
            }

        }
         return sb.toString();
    }
}