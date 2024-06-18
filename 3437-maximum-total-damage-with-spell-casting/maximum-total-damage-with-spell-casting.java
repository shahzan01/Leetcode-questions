class Solution {
    static int lowerbound(int[] arr, int k) {
        int n = arr.length;
        int high = n - 1;
        int ans = -1;
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= k) {
                high = mid - 1;

            } else {
                ans = mid;
                low = mid + 1;
            }

        }

        return (ans >= 0 && ans < n) ? arr[ans] : 0;

    }

    public long maximumTotalDamage(int[] arr) {
          Arrays.sort(arr);
         TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);

        }
        HashMap<Integer, Long> dp = new HashMap<>();
        long ans = 0;
        int last = 0;
        for (Integer cur : tm.keySet()) {
            long val = (long) Math.max((long)dp.getOrDefault(last, (long) 0),
                   (long)cur * tm.get(cur) + (long)dp.getOrDefault(lowerbound(arr, cur - 2), (long) 0));
            dp.put(cur, val);
            ans = (long)Math.max(ans, val);
            last = cur;

        }return ans;
    }
}