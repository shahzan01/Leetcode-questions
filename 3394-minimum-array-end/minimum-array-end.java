class Solution {
static long helper(int n, int x) {
        if (n == 1) {
            return (long) x;
        }
        List<Integer> li = new ArrayList<>();
        int i = 0;
        for (i = 0; i < 32; i++) {
            if ((x & (1 << i)) == 0) {
                li.add(i);
            }
        }
        for (i = 32; i < 64; i++) {

            li.add(i);
        }
        int t = n - 1;
        long ans = x;
        i = 0;
        while (t > 0) {
            if ((t & 1) == 1) {
                ans += (1L << li.get(i));
            }
            i++;
            t = t >> 1;
        }

        return ans;
    }


    public long minEnd(int n, int x) {
        return helper(n,x);
    }
}