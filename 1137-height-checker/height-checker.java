class Solution {
    public int heightChecker(int[] arr) {
         int freq[] = new int[101];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int ans = 0;
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            int currFreq = freq[i];

            while (currFreq > 0) {
                if (arr[idx] != i) {
                    ans++;
                }
                idx++;
                currFreq--;
            }

        }

        
        
        return ans;
    }
}