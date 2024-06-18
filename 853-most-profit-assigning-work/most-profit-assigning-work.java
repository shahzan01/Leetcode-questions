class Solution {
    public int maxProfitAssignment(int[] diff, int[] profit, int[] worker) {
 
   int n = diff.length;
        int totalprofit = 0;
        int previdx = -1;
        int premax = 0;

        int diffAndProfit[][] = new int[n][2];

        for (int i = 0; i < n; i++) {

            diffAndProfit[i][0] = diff[i];
            diffAndProfit[i][1] = profit[i];
        }
        Arrays.sort(worker);
        Arrays.sort(diffAndProfit, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                continue;
            }
            diffAndProfit[i][1] = Math.max(diffAndProfit[i][1], diffAndProfit[i - 1][1]);
        }

        int idx = 0;
        for (int i = 0; i < worker.length; i++) {
            while (idx < n && worker[i] >= diffAndProfit[idx][0]) {
                previdx = idx;
                idx++;
            }
            if (idx == n) {
                idx--;
            }
            if (worker[i] >= diffAndProfit[idx][0]) {
                totalprofit += diffAndProfit[idx][1];
            } else {

                totalprofit += (previdx == -1 ? 0 : diffAndProfit[previdx][1]);

            }

        }
 
 
 
 
 
 
 return totalprofit;
    }
}