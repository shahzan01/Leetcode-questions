class Solution {
    public int numWaterBottles(int nb, int ne) {
      int ans = 0;
        while (nb > 0) {
            if (nb >= ne) {
                nb -= ne;
                nb++;
                ans += ne;
            } else {
                ans += nb;
                nb = 0;
            }

        }return ans;   
    }
}