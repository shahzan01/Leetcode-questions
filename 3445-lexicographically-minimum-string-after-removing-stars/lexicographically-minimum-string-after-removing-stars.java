class Solution {
    public String clearStars(String s) {
         StringBuilder sb = new StringBuilder(s);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int x = sb.charAt(a) - 'a';
            int y = sb.charAt(b) - 'a';
            if (x == y) {
                return b - a;
            }
            return x - y;
        });

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '*') {
                hs.add(pq.poll());
                hs.add(i);
            } else {
                pq.add(i);
            }

        }
        StringBuilder sbb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(i)) {
                continue;
            }
            sbb.append(s.charAt(i));
        }
        return sbb.toString();
    }
}