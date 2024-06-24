class Solution {  
    public int minKBitFlips(int[] arr, int k) {
        int ans = 0;
        int flipcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((flipcount + arr[i]) % 2 == 0) {
                if (i > arr.length - k) {
                  return -1;
                } else {
                    ans++;
                    flipcount++;
                    arr[i] = -1;
                }

            }
            if (i + 1 >= k) {
                flipcount -= arr[i - k + 1] < 0 ? 1 : 0;
            }
           
        }return ans;
    }
}