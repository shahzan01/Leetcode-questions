class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int min) {
                int ans = 0;
        if (min >= customer.length) {
            for (int i = 0; i < customer.length; i++) {
                ans += customer[i];
            }
        return ans;
        }
        int max = Integer.MIN_VALUE;
        int slw_Sum = 0;
        int s = 0;
        int e = 0;
        for (int i = 0; i < min; i++) {
            if (grumpy[i] == 1) {
                slw_Sum += customer[i];

            }
            e++;

        }
        max = Math.max(max, slw_Sum);
        for (int i = 0; i < customer.length; i++) {
            if (grumpy[i] == 0) {
                ans += customer[i];
            }
            if (i >= e) {
                if (grumpy[i] == 1) {
                    slw_Sum += customer[i];
                }
                if (grumpy[s] == 1) {
                    slw_Sum -= customer[s];
                }
                s++;
                max = Math.max(max, slw_Sum);

            }

        }
        return max+ans;
    }
}