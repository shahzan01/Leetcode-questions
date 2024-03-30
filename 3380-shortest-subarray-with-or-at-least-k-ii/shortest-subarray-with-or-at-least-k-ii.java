class Solution {
    static int getn(int arr[]) {
        int i = 0;
        int sum = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] > 0) {
                sum += Math.pow(2, i);
            }
            i++;
        }
        return sum;
    }

    static void addn(int arr[], int n) {
        int i = arr.length - 1;
        while (n > 0) {
            int a = n & 1;
            arr[i] += a;
            i--;
            n = n >> 1;
        }

    }

    static void subn(int arr[], int n) {
        int i = arr.length - 1;
        while (n > 0) {
            int a = n & 1;
          if (arr[i] > 0) {
                arr[i] -= a;
            }
            i--;
            n = n >> 1;
        }

    }
    public int minimumSubarrayLength(int[] nums, int k) {
       int bit[] = new int[32];
        int ans = Integer.MAX_VALUE;
        int i = 0, j = 0, len = 0, n = nums.length;
        while (i < n) {
            addn(bit, nums[i]);
            len++;

            while (getn(bit) >= k && j <= i) {

                ans = Math.min(ans, len);
                subn(bit, nums[j]);
                j++;
                len--;
            }

            i++;
        }
     return ans==Integer.MAX_VALUE?-1:ans;
    }
}