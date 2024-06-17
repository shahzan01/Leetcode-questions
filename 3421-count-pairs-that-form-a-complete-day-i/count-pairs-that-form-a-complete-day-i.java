class Solution {
    public int countCompleteDayPairs(int[] arr) {
        
         int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % 24 == 0) {
                    ans++;
                }
            }
        }
        return ans;

    }
}