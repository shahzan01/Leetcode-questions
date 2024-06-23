class Solution {
    public int longestSubarray(int[] arr, int limit) {
         int ans = 0;

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
            while (j<=i&& Math.abs(tm.firstKey() - tm.lastKey()) > limit) {
                if (tm.get(arr[j]) > 1) {
                    tm.put(arr[j], tm.get(arr[j]) - 1);
                } else {
                    tm.remove(arr[j]);
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
            i++;
        }return ans;
    }
}