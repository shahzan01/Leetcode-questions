class Solution {
    public int[] xorQueries(int[] arr, int[][] qr) {
               int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        int ans[] = new int[qr.length];
        for (int i = 0; i < qr.length; i++) {
            if (qr[i][0] == 0) {
                ans[i] = prefix[qr[i][1]];
            } else {
                ans[i] = prefix[qr[i][1]] ^ prefix[qr[i][0] - 1];
            }
        }
return ans;
    }
}