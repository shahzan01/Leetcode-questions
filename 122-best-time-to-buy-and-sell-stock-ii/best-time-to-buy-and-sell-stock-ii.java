class Solution {
    public int maxProfit(int[] arr) {
      int profit = 0;
        int buy = arr[0];

        l: for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= buy) {
                buy = arr[i];
                continue l;
            } else {
                while (i < arr.length - 1 && arr[i + 1] > arr[i]) {
                    i++;
                }
                profit += arr[i] - buy;
                buy = arr[i];

            }  
    }
    return profit;
    }
}