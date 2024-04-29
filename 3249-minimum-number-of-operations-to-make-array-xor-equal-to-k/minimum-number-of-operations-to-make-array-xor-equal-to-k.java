class Solution {
    public int minOperations(int[] arr, int k) {
 
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        int ans = 0;
        while (k > 0 || xor > 0) {
            if (k % 2 != xor % 2) {
                ans++;
            }
            k /= 2;
            xor /= 2;
        }
         return ans;
    }
}