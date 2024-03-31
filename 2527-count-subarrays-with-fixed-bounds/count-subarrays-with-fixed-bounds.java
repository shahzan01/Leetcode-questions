class Solution {
    public long countSubarrays(int[] arr, int mink, int maxk) {
        long ans = 0;int left = -1, right = -1, bad = -1;

        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if (cur > maxk || cur < mink) {
                bad = i;
            }
            if (cur == maxk) {
                right = i;
            }
            if (cur == mink) {
                left = i;
            }
           ans += Math.max(0, Math.min(left, right)-bad);
        }return ans;
    }
}