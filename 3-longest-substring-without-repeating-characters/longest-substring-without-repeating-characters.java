class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs = new HashSet<>();
        int left = 0, right = 0, maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(right);
            if (!hs.isEmpty() && hs.contains(curr)) {
                while (hs.contains(curr)) {
                    hs.remove(s.charAt(left));
                    left++;
                }
            }
            maxlen = Math.max(maxlen, right - left + 1);

            hs.add(curr);
            right++;

        }
        return maxlen;   
    }
}