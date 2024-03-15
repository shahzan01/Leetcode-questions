class Solution {
    public int[] productExceptSelf(int[] arr) {
         int n = arr.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];

        }
        int right = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * arr[i];
        }
        return ans;
    }
}