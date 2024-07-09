class Solution {
    public double averageWaitingTime(int[][] arr) {
           double total_time = 0;
        int cur = arr[0][0];
        for (int i = 0; i < arr.length; i++) {

            if (cur >= arr[i][0]) {
                cur += arr[i][1];
                total_time += (cur - arr[i][0]);
            } else {
                cur = arr[i][0] + arr[i][1];
                total_time += arr[i][1];
            }

        }
        double ans = (double) total_time / arr.length;return ans;
    }
}