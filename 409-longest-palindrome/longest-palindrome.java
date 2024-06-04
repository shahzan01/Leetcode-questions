class Solution {
    public int longestPalindrome(String s) {
           int freq[] = new int[58];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }
        int ans = 0;
        int odd = 0;
        for (int i : freq) {
            if (i % 2 == 0) {
                ans += i;
            } else {
                odd = 1;
                ans += (i - 1);
            }
        }
       return ans + odd;
    }
}