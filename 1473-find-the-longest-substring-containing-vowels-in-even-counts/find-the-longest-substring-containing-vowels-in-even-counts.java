class Solution {
    public int findTheLongestSubstring(String s) {
            HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                mask = mask ^ (1 << 4);
            } else if (c == 'e') {
                mask = mask ^ (1 << 3);
            } else if (c == 'i') {
                mask = mask ^ (1 << 2);
            } else if (c == 'o') {
                mask = mask ^ (1 << 1);
            } else if (c == 'u') {
                mask = mask ^ (1 << 0);
            } else {
            }
            if (map.containsKey(mask)) {
                ans = Math.max(ans, i - map.get(mask));
            } else {
                map.put(mask, i);
            }

        }return ans;
    }
}