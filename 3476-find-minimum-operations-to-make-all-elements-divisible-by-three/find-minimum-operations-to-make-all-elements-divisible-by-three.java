class Solution {
    public int minimumOperations(int[] arr) {
          int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                continue;
            }
            int temp = arr[i] / 3;
            ans += Math.min(Math.abs((temp * 3) - arr[i]), Math.abs(((temp + 1) * 3) - arr[i]));

        }return ans;
    }
}