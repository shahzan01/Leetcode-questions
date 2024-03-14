class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0, 1);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(sum - goal)) {
                ans += hm.get(sum - goal);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}