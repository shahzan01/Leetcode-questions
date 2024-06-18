class Solution {
    public int sumSubarrayMins(int[] arr) {
         int n = arr.length;
        int next_smaller[] = new int[n];
        int prev_smaller[] = new int[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            prev_smaller[i] = i;
            next_smaller[i] = n - i - 1;
        }

        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            while (!st1.isEmpty() && cur < arr[st1.peek()]) {
                int j = st1.peek();
                next_smaller[j] = i - j - 1;

                st1.pop();

            }

            st1.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int cur = arr[i];

            while (!st2.isEmpty() && cur <= arr[st2.peek()]) {
                int j = st2.peek();
                prev_smaller[j] = j - i - 1;
                st2.pop();
            }
            st2.push(i);
        }           int mod=1000000007;
        long ans = 0;
         for (int i = 0; i < n; ++i) {
            ans += (long) ((next_smaller[i] + 1) * (prev_smaller[i] + 1)) % mod * arr[i] % mod;
            ans %= mod;
        }
      
        return (int) ans;
    }
}