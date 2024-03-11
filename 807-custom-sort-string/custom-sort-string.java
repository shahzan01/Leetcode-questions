class Solution {
    public String customSortString(String order, String s) {
          int prio[] = new int[26];
        int n = order.length();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            prio[c - 'a'] = n;
            n--;
        }
 PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> prio[b - 'a'] - prio[a - 'a']);
        HashMap<Character, Integer> hm = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            if (!pq.contains(c)) {
                pq.add(c);
            }
        }
       
       
        String ans = "";
        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.poll();
            int freq = hm.get(c);
             
            while (freq > 0) {
                sb.append(c);
                freq--;
            }
        }
        return sb.toString();  
    }
}