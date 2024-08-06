class Solution {
    public int minimumPushes(String s) {
             Integer freq[] = new Integer[26];
        Arrays.fill(freq, 0);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        Arrays.sort(freq, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                break;
            }
            ans += (i / 8 + 1) * freq[i];
        }return ans;
    }
}