class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int freqArr[] = new int[n];

        for (int[] i : roads) {
            freqArr[i[0]]++;
            freqArr[i[1]]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freqArr[b] - freqArr[a]);

        for (int i = 0; i < freqArr.length; i++) {
            pq.add(i);
        }

        long ans = 0;
        int m = n;
        while (!pq.isEmpty()) {
            ans += (long)(m * (long)freqArr[pq.poll()]);
            m--;
        }return ans;
    }
}