class Solution {
    public int numWaterBottles(int nb, int ne) {
      int ans = 0;
        ans += nb;
        while (ne <= nb) {
            nb -= ne;
            ans++;
            nb++;
        }
        return ans;   
    }
}