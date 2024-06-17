class Solution {
    public boolean judgeSquareSum(int c) {
        int low = 0;
        double high = (int) Math.pow(c, 0.5);
        while (low <= high) {
            int lowsqr = low * low;
            double highsqr = high * high;
            if (lowsqr + highsqr == c) {
               return true;
            } else if (lowsqr + highsqr < c) {
                low++;
            }

            else {
                high--;
            }

        }
return false;

    }
}