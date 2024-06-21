class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashMap<Character, Integer> hm = new HashMap<>();

        int i = 0;
        int j = 0;
        int maxlen = Integer.MIN_VALUE;

        while (i < s.length()) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);

            while (hm.get(c) > 1) {
                char rem = s.charAt(j);
                if (hm.get(rem) == 1) {
                    hm.remove(rem);
                } else {
                    hm.put(rem, hm.get(rem) - 1);
                }

                j++;
            }

            maxlen = Math.max(maxlen, i - j + 1);

            i++;
        }  return maxlen==Integer.MIN_VALUE?0:maxlen;
    }
}