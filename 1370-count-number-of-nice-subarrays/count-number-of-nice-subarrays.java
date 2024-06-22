class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int ans = 0;
        HashMap<Integer, Integer> freqofPrexSum = new HashMap<>();
        int sum = 0;
        freqofPrexSum.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]%2==0?0:1;
            if (freqofPrexSum.containsKey(sum - k)) {
                ans += freqofPrexSum.get(sum - k);
            }
            freqofPrexSum.put(sum, freqofPrexSum.getOrDefault(sum, 0) + 1);

        }return ans;
    }
}