class Solution {
     static int ans = 1;

    static void dffs(String s, int idx, HashSet<String> hs) {
        if (idx == s.length()) {
            ans = Math.max(ans, hs.size());
            System.out.println(hs);
            return;
        }
        for (int i = idx + 1; i <= s.length(); i++) {
            String sub = s.substring(idx, i);

            if (!hs.contains(sub)) {
                hs.add(sub);
                dffs(s, i, hs);
                hs.remove(sub);
            }
        }

        return;

    }
    public int maxUniqueSplit(String s) {
          HashSet<String> hs = new HashSet<>();
          ans=1;
        dffs(s, 0, hs);
        return ans;
    }
}