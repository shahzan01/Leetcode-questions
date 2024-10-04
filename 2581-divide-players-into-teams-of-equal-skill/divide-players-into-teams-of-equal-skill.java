class Solution {
    public long dividePlayers(int[] arr) {
             int n = arr.length;
        Arrays.sort(arr);
        long ans = 0;
        int v = arr[0] + arr[n - 1];
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] != v) {
                return -1;
            }
            ans += (long) arr[i] * arr[j];
            i++;
            j--;
        }
return ans;

    }
}