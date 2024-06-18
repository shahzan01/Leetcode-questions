class Solution {
    public int[] productExceptSelf(int[] arr) {
           int n = arr.length;
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int idx = arr.length - 2;
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i];
            right[idx] = right[idx + 1] * arr[idx];
            idx--;

        }
        for (int i = 0; i < arr.length; i++) {
            int l = (i - 1 >= 0 ? left[i - 1] : 1);
            int r = (i + 1 < n ? right[i + 1] : 1);
            arr[i] = l * r;
        }return arr;
    }
}