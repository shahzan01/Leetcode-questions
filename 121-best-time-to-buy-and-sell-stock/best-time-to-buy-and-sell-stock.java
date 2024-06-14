class Solution {
    public int maxProfit(int[] arr) {
         int buy = arr[0];
        int currProfit = 0;
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > buy) {
                currProfit = arr[i] - buy;
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                buy = arr[i];
            }
        }



return maxProfit;
    }
}