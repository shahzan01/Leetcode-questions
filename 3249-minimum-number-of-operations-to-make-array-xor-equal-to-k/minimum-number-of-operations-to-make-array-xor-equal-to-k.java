class Solution {
    public int minOperations(int[] arr, int k) {
         String bin = Integer.toBinaryString(k);
        int onesCount[] = new int[35];

        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toBinaryString(arr[i]);
            int idx = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '1') {
                    onesCount[idx]++;
                }
                idx++;
            }

        }
        HashSet<Integer> hs = new HashSet<>();
        int idx = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                hs.add(idx);
            }
            idx++;
        }
        int ans = 0;

        for (int i = 0; i < onesCount.length; i++) {
            if (hs.contains(i)) {
                if (onesCount[i] % 2 == 0) {
                    ans++;
                }
            } else {
                if (onesCount[i] % 2 != 0) {
                    ans++;
                }
            }
        }return ans;
    }
}