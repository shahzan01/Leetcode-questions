class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
         k %= n;
        int tempArr[] = new int[k];
        for (int i = 0; i < k; i++) {
            tempArr[i] = arr[n - k + i];

        }

        for (int i = n - k - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i + k];
            arr[i + k] = temp;

        }
        for (int i = 0; i < k; i++) {
            arr[i] = tempArr[i];

        }
    }
}