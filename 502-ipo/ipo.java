class Solution {
    static class pair {
        int capital;
        int profit;

        pair(int c, int p) {
            this.capital = c;
            this.profit = p;
        }

    }
    public int findMaximizedCapital(int k, int w, int[] profit, int[] capital) {
        int arr[][] = new int[profit.length][2];
        PriorityQueue<pair> maxprofir = new PriorityQueue<>((a, b) -> b.profit - a.profit);
        for (int i = 0; i < capital.length; i++) {
            arr[i][0] = capital[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

      
        int idx = 0;
        while (k > 0) {
            while (idx < arr.length && arr[idx][0] <= w) {
                maxprofir.add(new pair(arr[idx][0], arr[idx][1]));
                idx++;
            }

            if (maxprofir.isEmpty()) {
                break;
            }
            w += maxprofir.poll().profit;
            k--;

        }
    return w;
    }
}