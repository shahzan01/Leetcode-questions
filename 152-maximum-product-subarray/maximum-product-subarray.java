class Solution {
    public int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int mul = 1;
        int mul1 = 1;
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
            mul1 *= arr[n - i - 1];
            max = Math.max(max, mul);
            max1 = Math.max(max1, mul1);
            if (mul == 0) {
                mul = 1;
            }
            if (mul1 == 0) {
                mul1 = 1;
            }

        }

        max = Math.max(max, max1);
        return max;
    }
}