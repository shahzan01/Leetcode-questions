class Solution {
    public int minimumPushes(String s) {
              int ch[] = new int[26];
        int ans = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (Character c : map.keySet()) {
            pq.add(c);
        }
        int i = 0;
        while (!pq.isEmpty()) {
            char c = pq.poll();
            ans += (i / 8 + 1) * map.get(c);

            i++;

        }return ans;
    }
}