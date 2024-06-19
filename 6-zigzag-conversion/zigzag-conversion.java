class Solution {
    public String convert(String s, int n) {
    StringBuilder[] sbarr = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            sbarr[i] = new StringBuilder();
        }

        int idx = 0;
        r: while (idx < s.length()) {
            for (int i = 0; i < n; i++) {
                if (idx >= s.length()) {
                    break r;
                }
                sbarr[i].append(s.charAt(idx));
                idx++;

            }

            for (int i = n - 2; i >= 1; i--) {
                if (idx >= s.length()) {
                    break r;
                }
                sbarr[i].append(s.charAt(idx));

                idx++;
            }

        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sbarr[i].length(); j++) {
                ans.append(sbarr[i].charAt(j));
            }
        }
    return ans.toString();
    }
}