class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int ans = 0;

        while (arr[k] > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i]--;
                    ans++;
                }
                if (arr[k] == 0) {
                    break;
                }

            }
        }
        return ans;
    }
}