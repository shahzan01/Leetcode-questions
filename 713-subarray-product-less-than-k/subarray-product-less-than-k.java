class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
         int ans = 0;
        int mul = 1;
        int i = 0, j = 0;
        while (i < arr.length) {
            mul *= arr[i];
            while (j<=i && mul >= k) {
                mul /= arr[j];
                j++;
            }
            ans += i - j + 1;
            i++;
        }
        return ans;
    }
}