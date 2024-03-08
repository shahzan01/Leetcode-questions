class Solution {
    public int maxFrequencyElements(int[] arr) {
         HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));

        for (Integer i : hm.keySet()) {
            pq.add(i);
        }
        int ans = 0;

        while (!pq.isEmpty() && !hm.isEmpty()) {
            int cur = pq.poll();
            int frq = hm.get(cur);
            ans += frq;
            if (!pq.isEmpty() && hm.get(pq.peek()) == frq) {
                continue;
            } else {
                break;
            }
        }
        return ans;
    }
}