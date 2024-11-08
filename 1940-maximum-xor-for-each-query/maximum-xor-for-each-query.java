class Solution {
    public int[] getMaximumXor(int[] arr, int maximumBit) {
        
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < maximumBit; j++) {
                if ((xor & (1 << j)) == 0) {
                    sb.insert(0, "1");
                } else {
                    sb.insert(0, "0");
                }
            }
            xor ^= arr[i];
            ans[arr.length - i - 1] = Integer.parseInt(sb.toString(), 2);

        }
        return ans;
    }
}