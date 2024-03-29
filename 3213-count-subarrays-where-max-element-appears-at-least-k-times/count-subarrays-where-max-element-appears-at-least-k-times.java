class Solution {
    public long countSubarrays(int[] arr, int k) {
        int n = arr.length;
        long ans = 0;
        int freq = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int i = 0, j = 0;
        while (i < n) {
            if (arr[i] == max) {
                freq++;
            }
            while (freq >= k && j <= i) {
                ans += n - i;
                if (arr[j] == max) {
                    freq--;
                }
                j++;
            }

            i++;

        }
        return ans;
    }
}