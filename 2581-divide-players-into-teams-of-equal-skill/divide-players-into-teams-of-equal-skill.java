class Solution {
    public long dividePlayers(int[] arr) {
 int freq[] = new int[1001];

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            while (freq[idx] == 0) {
                idx++;
            }
            arr[i] = idx;
            freq[idx]--;

        }

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