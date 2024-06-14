class Solution {
    public int minIncrementForUnique(int[] arr) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for (int i : arr) {
            pq.add(i);

        }
        int max = pq.peek();
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            if (hs.contains(cur)) {
                int diff = Math.abs(max - cur) + 1;
                cur += diff;
                ans += diff;
            }

            max = Math.max(max, cur);

            hs.add(cur);
           
        }return ans;
    }
}