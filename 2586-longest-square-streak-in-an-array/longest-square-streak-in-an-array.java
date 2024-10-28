class Solution {
    public int longestSquareStreak(int[] arr) {
            Arrays.sort(arr);
        HashSet<Integer> hs = new HashSet<>();
        int ans = 1;
        HashSet<Integer> done = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!done.contains(arr[i])) {
                int n = arr[i];
                int t = 1;
              while (Long.compare((long) n * n, 1000000) < 0 && hs.contains(n * n)) {
                    done.add(n);
                    t++;
                    n *= n;
                }
                ans = Math.max(ans, t);

            }
        }
        return ans==1?-1:ans;
    }
}