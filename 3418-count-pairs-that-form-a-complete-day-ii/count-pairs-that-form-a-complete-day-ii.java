class Solution {
    public long countCompleteDayPairs(int[] arr) {
         HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = arr[i] % 24;
            hm.put(rem, hm.getOrDefault(rem, 0) + 1);
        }
        long ans = 0;
        long  freq = (long) hm.getOrDefault(12, 0);

        ans += (long) (freq * (long) (freq - 1)) / 2;
        freq = hm.getOrDefault(0, 0);
        ans += (long) (freq * (long) (freq - 1)) / 2;

        for (int i = 1; i < 12; i++) {
            ans += (long) hm.getOrDefault(i, 0) * (long) (hm.getOrDefault(24 - i, 0));
        }
return ans;
    }
}