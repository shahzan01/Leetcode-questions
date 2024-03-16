class Solution {
    public int findMaxLength(int[] arr) {
          int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxlen = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i] == 0 ? -1 : 1;
            if (sum == 0) {
                maxlen = i + 1;
            } else if (hm.containsKey(sum)) {
                maxlen = Math.max(maxlen, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }

        }
        return maxlen;
    }
}