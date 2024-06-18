class Solution {
       static class pair {
        int idx;
        int val;

        pair(int c, int p) {
            this.idx = c;
            this.val = p;
        }

    }
    public int sumSubarrayMins(int[] arr) {
         int n = arr.length;
        int next_smaller[] = new int[n];
        int prev_smaller[] = new int[n];
        Stack<pair> st1 = new Stack<>();
        Stack<pair> st2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            prev_smaller[i] = i;
            next_smaller[i] = n - i - 1;
        }

        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            while (!st1.isEmpty() && cur < st1.peek().val) {
                int j = st1.peek().idx;
                next_smaller[j] = i - j - 1;

                st1.pop();

            }

            st1.push(new pair(i, cur));
        }
        for (int i = n - 1; i >= 0; i--) {
            int cur = arr[i];

            while (!st2.isEmpty() && cur <= st2.peek().val) {
                int j = st2.peek().idx;
                prev_smaller[j] = j - i - 1;
                st2.pop();
            }
            st2.push(new pair(i, cur));
        }
           int mod=1000000007; 
        long ans = 0;
       
        for (int i = 0; i < n; ++i) {
            ans += (long) ((next_smaller[i] + 1) * (prev_smaller[i] + 1)) % mod * arr[i] % mod;
            ans %= mod;
        }
      
        return (int) ans;
    }
}