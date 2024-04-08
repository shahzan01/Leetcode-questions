class Solution {
    public int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul = 1;
            for (int j = i; j < arr.length; j++) {
                mul *= arr[j];
                max = Math.max(max, mul);

            }
        }
        return max;
    }
}