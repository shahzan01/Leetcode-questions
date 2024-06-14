class Solution {
    public boolean canJump(int[] arr) {
           int n = arr.length;
        int last = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if ((arr[i] + i) >= last) {
                last = i;
            }
        }
       return last<=0;
    }
}