class Solution {
     static int helper(int n, int cur, int copied) {
        if (n < cur) {
            return Integer.MAX_VALUE;
        }
        if (n == cur) {
            return 0;
        }
        int ans1 = Integer.MAX_VALUE;
        if (copied > 0) {
            ans1 = helper(n, cur + copied, copied);
        }
        int ans2 = helper(n, cur + cur, cur);
        ans2 = ans2 == Integer.MAX_VALUE ? ans2 : ans2 + 2;
        ans1 = ans1 == Integer.MAX_VALUE ? ans1 : ans1 + 1;
        return Math.min(ans1, ans2);

    }
    public int minSteps(int n) {
        return helper(n,1,0);
    }
}