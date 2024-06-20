class Solution {
        static int helper(int arr[], int d) {
        int n = arr.length;
        int count = 1;
        int prev = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[prev] >= d) {
                count++;
                prev = i;
            }

        }

        return count;

    }
    public int maxDistance(int[] arr, int m) {
    Arrays.sort(arr);
    
        int n = arr.length;
        int low = 1;
        int high = arr[n - 1] - arr[0];
        int ans = 0;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            int count = helper(arr, mid);

            if (count < m) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;

            }

        }
return ans;
    }
}