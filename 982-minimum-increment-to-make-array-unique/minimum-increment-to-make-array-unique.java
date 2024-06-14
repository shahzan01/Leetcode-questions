class Solution {
    public int minIncrementForUnique(int[] arr) {
             int sortedArr[] = new int[100001];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sortedArr[arr[i]]++;
            max = Math.max(max, arr[i]);
        }
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            int freq = sortedArr[i];
            while (freq > 0) {
                arr[idx] = i;
                idx++;
                freq--;
            }

        }
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] <= arr[i - 1]) {

                int diff = Math.abs(arr[i] - arr[i - 1]) + 1;
                arr[i] += diff;
                ans += diff;
            }

        }
        
       return ans;
    }
}