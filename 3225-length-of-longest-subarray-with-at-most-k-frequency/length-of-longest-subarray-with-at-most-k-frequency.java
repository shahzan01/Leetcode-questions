class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
       int ans = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int i = 0, j = 0;
        while (i < arr.length) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            while (j <= i && freq.get(arr[i]) > k) {
                freq.put(arr[j], freq.get(arr[j]) - 1);
                j++;
                
            }
               ans = Math.max(ans, i - j + 1);
            i++;
        }
        return ans; 
    }
}