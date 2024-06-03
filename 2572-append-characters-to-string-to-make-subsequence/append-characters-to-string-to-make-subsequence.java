class Solution {
    public int appendCharacters(String s, String t) {
        int ans = 0, i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            char a = s.charAt(i);
            char b = t.charAt(j);
            if (a == b) {
                j++;
            }

            i++;

        }

        while (j < t.length()) {
            ans++;
            j++;
        }return ans;
    }
}