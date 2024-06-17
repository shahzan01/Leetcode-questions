class Solution {
    public boolean judgeSquareSum(int c) {
        int low = 0;
        double high = (int) Math.pow(c, 0.5);
        while (low <= high) {
            if ((low * low) + (high * high) == c) {
              return true;
            
            } else if ((low * low) + (high * high) < c) {
                low++;
            }

            else {
                high--;
            }

        }
return false;

    }
}