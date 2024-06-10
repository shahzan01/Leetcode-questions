class Solution {
    public int numberOfChild(int n, int k) {
         int round = k / (n - 1);
        int mod = k % (n - 1);
        int ans = 0;
        if (round % 2 == 0) {
            ans = 0 + mod;
        } else {
            ans = (n - 1) - mod;
        }
        return ans;
    }
}