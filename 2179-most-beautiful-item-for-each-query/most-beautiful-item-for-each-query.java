class Solution {
       static void dbg(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
        static int lowerbound1(int items[][], int i) {
        int low = 0;
        int high = items.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (items[mid][0] == i) {
                return mid;
            }
            if (items[mid][0] > i) {
                high = mid - 1;
            } else {
                ans = mid;
                ;
                low = mid + 1;
            }

        }
        return ans;

    }

    static int[] hela(int items[][], int q[]) {
        Arrays.sort(items, (a, b) -> {
            return a[0] - b[0];
        });
        HashMap<Integer, Integer> dp = new HashMap<>();
        int max = 0;
        for (int i = 0; i < items.length; i++) {
            int it = items[i][0];
            int p = items[i][1];
            max = Math.max(max, p);
            if (dp.containsKey(it)) {
                dp.put(it, Math.max(max, dp.get(it)));
            } else {
                dp.put(it, max);
            }

        }
        dbg(items);
        dbg(dp);
        int ans[] = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            int idx = lowerbound1(items, q[i]);
            if (idx == -1) {
                ans[i] = 0;
            } else {
                ans[i] = dp.get(items[idx][0]);
            }
        }

        return ans;
    }
    public int[] maximumBeauty(int[][] items, int[] queries) {
        return hela(items,queries);
    }
}