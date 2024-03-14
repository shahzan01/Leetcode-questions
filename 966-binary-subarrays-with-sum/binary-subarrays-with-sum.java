class Solution {
    static int helper(int arr[], int goal) {
        int n = arr.length;
        int i = 0, j = 0, sum = 0, ans = 0;

        while (j < n) {
            sum += arr[j];
            while (sum > goal && i<=j) {
                sum -= arr[i];
                i++;
            }
            ans += j - i + 1;

            j++;
        }
        return ans;
    }

    public int numSubarraysWithSum(int[] arr, int goal) {
        
       return helper(arr, goal) - helper(arr, goal - 1);
    }
}