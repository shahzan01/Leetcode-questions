class Solution {
    public String frequencySort(String s) {
        


        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        System.out.println(hm);
        PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return hm.get(c2) - hm.get(c1);
            }
        });
        for (Character cur : hm.keySet()) {
            pq.add(cur);
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char curr = pq.poll();
            int fre = hm.get(curr);
            for (int i = 0; i < fre; i++) {
                sb.append(curr);
            }
        }
       return sb.toString();











    }
}