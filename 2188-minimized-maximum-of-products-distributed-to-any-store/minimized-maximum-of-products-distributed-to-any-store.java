class Solution {
      static boolean checker(int n, Integer arr[], int val) {

        for (int i = 0; i < arr.length; i++) {
            if (n <= 0) {
                return false;
            }
            n -= Math.ceilDiv(arr[i], val);
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
    
        Integer arr[] = new Integer[quantities.length];
        long sum = 0;
        for (int i = 0; i < quantities.length; i++) {
            sum += quantities[i];
            arr[i] = quantities[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        long low = Math.ceilDiv(sum, n);
        long high = sum;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (checker(n, arr, (int) mid)) {
                ans = (int) mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }
}