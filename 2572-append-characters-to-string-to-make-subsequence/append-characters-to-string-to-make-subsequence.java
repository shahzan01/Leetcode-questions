class Solution {
    public int appendCharacters(String s, String t) {
        int ans = 0, i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
           
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }

            i++;

        }

   ans += (t.length() - j);return ans;
    }
}