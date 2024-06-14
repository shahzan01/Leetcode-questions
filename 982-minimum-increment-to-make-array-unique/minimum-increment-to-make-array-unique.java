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
        
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;

        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
        int cur = arr[i];
        if (hs.contains(cur)) {
        int diff = Math.abs(max - cur) + 1;
        cur += diff;
        ans += diff;
        }

        max = Math.max(max, cur);

        hs.add(cur);

        }return ans;
    }
}