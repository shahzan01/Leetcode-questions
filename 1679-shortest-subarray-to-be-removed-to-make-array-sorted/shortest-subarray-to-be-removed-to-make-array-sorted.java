class Solution {
      static boolean checker(boolean prefix[], boolean sufix[], int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i <= arr.length - k; i++) {
            boolean isnonDec = ((i == 0 || prefix[i - 1]) && (i + k >= n || sufix[i + k]));

            if (isnonDec && (i == 0 || i + k >= n || arr[i - 1] <= arr[i + k])) {
                return true;
            }
        }

        return false;
    }

    public int findLengthOfShortestSubarray(int[] arr) {
         int n = arr.length;
        boolean sufix[] = new boolean[n];
        boolean prefix[] = new boolean[n];
        prefix[0] = true;
        sufix[n - 1] = true;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] && (arr[i] >= arr[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            sufix[i] = sufix[i + 1] && (arr[i] <= arr[i + 1]);
        }
       
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
           
            if (checker(prefix, sufix, arr, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
}