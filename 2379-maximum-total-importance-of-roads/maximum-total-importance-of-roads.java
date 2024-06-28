class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int freqArr[] = new int[n];

        for (int[] i : roads) {
            freqArr[i[0]]++;
            freqArr[i[1]]++;
        }
        Arrays.sort(freqArr);

        int m = n;
        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += (long) m * freqArr[i];
            m--;
        }return ans;
    }
}