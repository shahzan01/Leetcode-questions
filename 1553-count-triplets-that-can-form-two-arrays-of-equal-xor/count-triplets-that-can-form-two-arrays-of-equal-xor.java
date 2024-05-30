class Solution {
    public int countTriplets(int[] arr) {
          int ans = 0;
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = 0;
       
            for (int k = i; k < arr.length; k++) {
                xor = xor ^ arr[k];

                if (xor == 0) {
                    ans += (k - i);
                }

            }

        }return ans;
    }
}