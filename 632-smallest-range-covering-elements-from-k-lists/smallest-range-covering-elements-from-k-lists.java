class Solution {static class Pair {
        int listIndex;
        int elementIndex;
        
        Pair(int listIndex, int elementIndex) {
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }
    }
    
    public static int[] hel(List<List<Integer>> nums) {
        int k = nums.size();
        int[] ans = new int[]{-1, -1};
        int minRange = Integer.MAX_VALUE;
        
        // Priority Queue to keep track of the minimum element across all lists
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(nums.get(a.listIndex).get(a.elementIndex), nums.get(b.listIndex).get(b.elementIndex))
        );
        
        int max = Integer.MIN_VALUE;
        
        // Initialize the priority queue
        for (int i = 0; i < k; i++) {
            int value = nums.get(i).get(0);
            pq.offer(new Pair(i, 0));
            max = Math.max(max, value);
        }
        
        while (pq.size() == k) {
            Pair minPair = pq.poll();
            int min = nums.get(minPair.listIndex).get(minPair.elementIndex);
            
            // Update the smallest range if needed
            if (max - min < minRange) {
                minRange = max - min;
                ans[0] = min;
                ans[1] = max;
            }
            
            // Move to the next element in the list of the extracted element
            if (minPair.elementIndex + 1 < nums.get(minPair.listIndex).size()) {
                int nextValue = nums.get(minPair.listIndex).get(minPair.elementIndex + 1);
                pq.offer(new Pair(minPair.listIndex, minPair.elementIndex + 1));
                max = Math.max(max, nextValue);
            }
        }
        
        return ans;
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        return hel(nums);
    }
}