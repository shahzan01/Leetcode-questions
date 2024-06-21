class Solution {
    public int minSubArrayLen(int tar, int[] arr) {
         int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i];
            while (j <= i && sum >= tar) {
                ans = Math.min(ans, i - j + 1);
                sum -= arr[j];
                j++;

            }

            i++;
        }

      return ans==Integer.MAX_VALUE?0:ans;  
    }
}