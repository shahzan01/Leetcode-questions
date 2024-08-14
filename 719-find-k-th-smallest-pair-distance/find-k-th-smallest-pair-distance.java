class Solution {
     static int countPairs(int arr[], int dis) {

        int ans = 0;
        int i = 0;
        int j = i + 1;
        while (j < arr.length) {
            while (i < j - 1 && Math.abs(arr[i] - arr[j]) > dis) {
                i++;
            }

            if (Math.abs(arr[i] - arr[j]) <= dis) {
                ans += (j - i);
            }

            j++;
        }

        return ans;

    }
    public int smallestDistancePair(int[] arr, int k) {
      Arrays.sort(arr);
      
        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = countPairs(arr, mid);
            if (count >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }return ans;
    }
}