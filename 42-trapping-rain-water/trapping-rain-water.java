class Solution {
    public int trap(int[] arr) {
         int n = arr.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = 0;
        rmax[n - 1] = 0;
        int j = n - 2;
        for (int i = 1; i < arr.length - 1; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i - 1]);
            rmax[j] = Math.max(rmax[j + 1], arr[j + 1]);
            j--;
        }
        int rain = 0;
        for (int i = 0; i < n; i++) {
            int val = Math.min(rmax[i], lmax[i]) - arr[i];
            if (val > 0) {
                rain += val;
            }
        } 
        return rain;
    }
}