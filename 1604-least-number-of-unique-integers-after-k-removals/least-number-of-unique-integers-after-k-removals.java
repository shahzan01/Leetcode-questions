class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(hm.values());
        while (k > 0 && !pq.isEmpty()) {
            int curr = pq.poll();
            if (curr <= k) {
                k -= curr;
            } else {
                pq.add(curr - k);
                k = 0;
            }

        }return pq.size(); 
    }
}