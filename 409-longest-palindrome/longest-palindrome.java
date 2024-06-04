class Solution {
    public int longestPalindrome(String s) {
         HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        int oddmax = 0;
             for (char c : hm.keySet()) {
            if (hm.get(c) % 2 == 0) {
                ans += hm.get(c);
            } else {oddmax=1;
              ans+=(hm.get(c)-1);
            }

        }
  return ans+oddmax;
    }
}