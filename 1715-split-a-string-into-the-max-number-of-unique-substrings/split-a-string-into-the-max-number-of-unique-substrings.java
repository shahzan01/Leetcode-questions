class Solution {
    public int maxUniqueSplit(String s) {

            int n = s.length();
        int ans = 1;
        r: for (int i = 0; i < (1 << n); i++) {
            int last = 0;
            int t = i;
            HashSet<String> hs = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((t & (1 << j)) != 0) {
                    String sub = s.substring(last, j + 1);
                    if (hs.contains(sub)) {
                        continue r;
                    }
                    last = j + 1;
                    hs.add(sub);
                }
            }
            if (last != n) {
                String sub = s.substring(last, n);
                if (hs.contains(sub)) {
                    continue r;
                }
                hs.add(sub);
            }
            ans = Math.max(ans, hs.size());
        }
        return ans; 
    }
}