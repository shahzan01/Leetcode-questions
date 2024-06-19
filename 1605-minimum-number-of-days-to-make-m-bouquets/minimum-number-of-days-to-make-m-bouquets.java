class Solution {
     static int helper(int arr[], int day, int k) {

        int j = 0;
        int size = 0;
        int count = 0;
        int n = arr.length;
        while (j <= arr.length) {
            if (size == k) {
                count++;
                size = 0;
            }
            if (j >= arr.length) {
                break;
            }
            if (arr[j] <= day) {
                j++;
                size++;
            }

            else {

                j++;
                size = 0;
            }

        }

        return count;

    }
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k > arr.length){return -1;}
         int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        int ans = 0;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            int count = helper(arr, mid, k);
            if (count < m) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }

        }return ans;

    }
}