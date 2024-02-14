class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int positive[] = new int[n / 2];
        int negatinve[] = new int[n / 2];
        int p = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive[p] = arr[i];
                p++;
            } else {
                negatinve[neg] = arr[i];
                neg++;
            }
        }
        p = 1;
        neg = 0;
        arr[0] = positive[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = positive[p];
                p++;
            } else {
                arr[i] = negatinve[neg];
                neg++;
            }}
 return arr;
    }
}