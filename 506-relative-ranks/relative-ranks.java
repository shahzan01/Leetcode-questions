class Solution {
    public String[] findRelativeRanks(int[] arr) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> arr[b] - arr[a]);
       for (int i = 0; i < arr.length; i++) {
            pq.add(i);
        }
      
    
        String[] ans = new String[arr.length];
        int count = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = pq.poll();
            if (count == 1) {
                ans[idx] = "Gold Medal";
            } else if (count == 2) {
                ans[idx] = "Silver Medal";
            } else if (count == 3) {
                ans[idx] = "Bronze Medal";
            } else {
                ans[idx] = Integer.toString(count);
            }
            count++;
        }
        return ans;
    }
}