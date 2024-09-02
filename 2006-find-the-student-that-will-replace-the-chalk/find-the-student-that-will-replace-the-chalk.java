class Solution {
    public int chalkReplacer(int[] arr, int k) {
          long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ans = -1;
        if (k < sum) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > k) {
                    ans = i;
                    break;
                } else {
                    k -= arr[i];
                }
            }

        } else {
            long mod = k % sum;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mod) {
                    ans = i;
                    break;
                } else {
                    mod -= arr[i];
                }
            }
        }
        return ans;
    }
}