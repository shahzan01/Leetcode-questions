class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j];
                li.add(s);
            }
        }
        Collections.sort(li);
        int ans = 0;
        int mod = 1000000007;
        for (int i = left - 1; i < right; i++) {
            ans += li.get(i);
            ans %= mod;
        }
return ans;
    }
}