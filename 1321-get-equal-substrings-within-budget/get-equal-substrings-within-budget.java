class Solution {
    public int equalSubstring(String s, String t, int cost) {
         int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        while (i < s.length()) {
            int dif = Math.abs(t.charAt(i) - s.charAt(i));
            cost -= dif;
            while (cost < 0 && j <= i) {
                int temp = Math.abs(t.charAt(j) - s.charAt(j));
                cost += temp;
                j++;
            }
         
            ans = Math.max(ans, i - j + 1);

            i++;

        }return ans;
    }
}