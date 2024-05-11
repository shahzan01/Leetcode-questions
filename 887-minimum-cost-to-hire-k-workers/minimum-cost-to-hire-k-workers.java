class Solution {
    static class pair  {
        double val;
        int freq;

        public pair(double v, int f) {
            this.val = v;
            this.freq = f;
        }

    }
    public double mincostToHireWorkers(int[] qua, int[] wage, int k) {
    int n = qua.length;
        pair[] worker = new pair[n];
        for (int i = 0; i < n; i++) {
            worker[i] = new pair((double) wage[i] / qua[i], qua[i]);
        }

        Arrays.sort(worker, Comparator.comparing((a) -> a.val));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        double ans = Integer.MAX_VALUE;
        int count = 0;
        for (pair p : worker) {
            double ratio = p.val;
            int quality = p.freq;
            count += quality;
            pq.add(quality);
            if (pq.size() > k) {
                count -= pq.poll();
            }
            if (pq.size() == k) {
                ans = Math.min(ans, count * ratio);
            }

        }  return ans;
    }
}