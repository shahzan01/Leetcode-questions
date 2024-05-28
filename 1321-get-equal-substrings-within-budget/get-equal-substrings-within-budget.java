class Solution {
    public int equalSubstring(String s, String t, int cost) {
         int co[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            co[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        while (i < s.length()) {

            cost -= co[i];
            while (cost < 0 && j <= i) {

                cost += co[j];
                j++;
            }

            ans = Math.max(ans, i - j + 1);

            i++;

        }
        return ans;
    }
}