class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int rem[] = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int ans = 0;
        int mod = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            mod = sum % k;
            if (mod < 0) {
                mod += k;
            }
            rem[mod]++;
        }

        for (int i = 0; i < k; i++) {
            if (rem[i] > 1) {
                ans += (rem[i] * (rem[i] - 1)) / 2;
            }
        }
        ans += rem[0];

return ans;
    }
}