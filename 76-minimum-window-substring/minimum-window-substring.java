class Solution {
    public String minWindow(String s, String t) {
         HashMap<Character, Integer> hm_t = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            hm_t.put(c, hm_t.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int minlen = Integer.MAX_VALUE;
        int count = t.length();
        String ans = "";
        while (i < s.length()) {
            char c = s.charAt(i);
            if (hm_t.containsKey(c)) {
                if (hm_t.getOrDefault(c, 0) > 0) {

                    count--;
                }
                hm_t.put(c, hm_t.get(c) - 1);
            }

            while (j <= i && count == 0) {

                if ((i - j + 1) < minlen) {
                    minlen = i - j + 1;
                    ans = s.substring(j, i + 1);

                }
                char rem = s.charAt(j);

                if (hm_t.containsKey(rem)) {
                    hm_t.put(rem, hm_t.get(rem) + 1);
                    if (hm_t.get(rem) > 0) {
                        count++;
                    }
                }

                j++;
            }

            i++;
        }return ans;
    }
}