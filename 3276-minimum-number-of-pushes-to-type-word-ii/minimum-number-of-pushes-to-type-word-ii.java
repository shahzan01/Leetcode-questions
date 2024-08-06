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
        System.out.println(pq);
        while (!pq.isEmpty()) {
            int idx = pq.poll() - 'a';
            if (ch[idx] == 0) {
                if (count < 8) {
                    count++;
                    ch[idx]++;
                } else if (count < 16) {
                    count++;
                    ch[idx] = 2;
                } else if (count < 24) {
                    count++;
                    ch[idx] = 3;
                } else {
                    count++;
                    ch[idx] = 4;
                }

            }

        }
        for (int i = 0; i < s.length(); i++) {
            ans += ch[s.charAt(i) - 'a'];
        }return ans;
    }
}